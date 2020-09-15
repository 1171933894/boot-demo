package com.boot.demo;

import com.boot.demo.common.ExportExcelUtil;
import com.boot.demo.constant.TablesConstant;
import com.boot.demo.domain.TableDTO;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    //导入JDBCTemplate模板
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {

    }

    @Test
    public void exportExcel() throws Exception {
        Map<String, Map<TablesConstant.Tuple, List<TableDTO>>> datas = new HashMap<>();
        for (String sys : TablesConstant.systemTalbeMap.keySet()) {
            for (int j = 0; j < TablesConstant.systemTalbeMap.get(sys).size(); j++) {
                TablesConstant.Tuple tuple = TablesConstant.systemTalbeMap.get(sys).get(j);
                String sql = "select column_name ,column_comment ,column_type ,is_nullable ,COLUMN_DEFAULT as 'def_val','' as 'menu_val' from information_schema.columns where table_name = '" + tuple.getName() + "'";
                RowMapper<TableDTO> rowMapper = new RowMapper<TableDTO>() {
                    @Override
                    public TableDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                        TableDTO tableDTO = new TableDTO();
                        tableDTO.setColumn_comment(rs.getString("column_comment"));
                        tableDTO.setColumn_name(rs.getString("column_name"));
                        tableDTO.setColumn_type(rs.getString("column_type"));
                        tableDTO.setDef_val(rs.getString("def_val"));
                        tableDTO.setIs_nullable(rs.getString("is_nullable"));
                        tableDTO.setMenu_val(rs.getString("menu_val"));
                        return tableDTO;
                    }
                };
                List<TableDTO> query = jdbcTemplate.query(sql, rowMapper);
                Map<TablesConstant.Tuple, List<TableDTO>> relt = new HashMap<>();
                relt.put(tuple, query);
                if (datas.get(sys) == null) {
                    datas.put(sys, relt);
                } else {
                    datas.get(sys).putAll(relt);
                }
            }
        }

        doExport(datas);
    }

    @Test
    public void doExport(Map<String, Map<TablesConstant.Tuple, List<TableDTO>>> datas) throws Exception {
        // 声明一个工作薄
        XSSFWorkbook workbook = new XSSFWorkbook();
        ExportExcelUtil<TableDTO> util = new ExportExcelUtil<TableDTO>();
        OutputStream out = new FileOutputStream("D:/test.xlsx");
        for (String key : datas.keySet()) {
            // 准备数据
            Map<TablesConstant.Tuple, List<TableDTO>> map = datas.get(key);
            String[] columnNames = {"字段名", "中文名", "字段类型", "是否为空", "默认值", "枚举值"};
            util.exportExcel2007(workbook, key, columnNames, map, out, "yyyy-MM-dd hh:mm:ss");
        }
        try {
            workbook.write(out); //循环创建sheet及数据后，一并导出
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}