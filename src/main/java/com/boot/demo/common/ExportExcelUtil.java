package com.boot.demo.common;

import com.boot.demo.constant.TablesConstant;
import com.boot.demo.domain.TableDTO;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.*;

import java.awt.*;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 导出Excel
 */
public class ExportExcelUtil<T> {
    /**
     * 合并单元格设置边框
     * @param i
     * @param cellRangeTitle
     * @param sheet
     * @param workBook
     */
    private static void setBorderForMergeCell(int i, CellRangeAddress cellRangeTitle, Sheet sheet, Workbook workBook){
        RegionUtil.setBorderBottom(i, cellRangeTitle, sheet, workBook);
        RegionUtil.setBorderLeft(i, cellRangeTitle, sheet, workBook);
        RegionUtil.setBorderRight(i, cellRangeTitle, sheet, workBook);
        RegionUtil.setBorderTop(i, cellRangeTitle, sheet, workBook);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void exportExcel2007(XSSFWorkbook workbook, String title, String[] headers, Map<TablesConstant.Tuple, List<TableDTO>> datasMap, OutputStream out, String pattern) {

        // 生成一个表格
        XSSFSheet sheet = workbook.createSheet(title);


        XSSFCellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFillForegroundColor(IndexedColors.SKY_BLUE.getIndex());
        cellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
        cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); //下边框
        cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);//左边框
        cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);//上边框
        cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);//右边框

        // 设置表格默认列宽度为15个字节
        sheet.setDefaultColumnWidth(20);
        // 生成一个样式
        XSSFCellStyle style = workbook.createCellStyle();
        // 设置这些样式
        style.setFillForegroundColor(new XSSFColor(java.awt.Color.gray));
        style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
        style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
        style.setBorderRight(XSSFCellStyle.BORDER_THIN);
        style.setBorderTop(XSSFCellStyle.BORDER_THIN);
        style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        // 生成一个字体
        XSSFFont font = workbook.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
        font.setFontName("黑体");
        font.setColor(new XSSFColor(Color.BLACK));
        font.setFontHeightInPoints((short) 11);
        // 把字体应用到当前的样式
        style.setFont(font);
        // 生成并设置另一个样式
        XSSFCellStyle style2 = workbook.createCellStyle();
        style2.setFillForegroundColor(new XSSFColor(java.awt.Color.WHITE));
        style2.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
        style2.setBorderBottom(XSSFCellStyle.BORDER_THIN);
        style2.setBorderLeft(XSSFCellStyle.BORDER_THIN);
        style2.setBorderRight(XSSFCellStyle.BORDER_THIN);
        style2.setBorderTop(XSSFCellStyle.BORDER_THIN);
        style2.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        style2.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
        // 生成另一个字体
        XSSFFont font2 = workbook.createFont();
        font2.setBoldweight(XSSFFont.BOLDWEIGHT_NORMAL);
        // 把字体应用到当前的样式
        style2.setFont(font2);

        int curRow = 0;

        for (TablesConstant.Tuple tuple : datasMap.keySet()) {

            XSSFCell cellHeader;

            XSSFRow rOne = sheet.createRow(curRow);
            cellHeader = rOne.createCell(0);
            cellHeader.setCellValue(new XSSFRichTextString("表名"));
            cellHeader.setCellStyle(cellStyle);
            cellHeader = rOne.createCell(1);
            cellHeader.setCellValue(new XSSFRichTextString(tuple.getName()));
            CellRangeAddress region1 = new CellRangeAddress(curRow, curRow, 1, 5);            cellHeader.setCellStyle(cellStyle);
            setBorderForMergeCell(CellStyle.BORDER_THIN, region1, sheet, workbook);
            sheet.addMergedRegion(region1);
            curRow++;


            XSSFRow rTwo = sheet.createRow(curRow);
            cellHeader = rTwo.createCell(0);
            cellHeader.setCellValue(new XSSFRichTextString("描述"));
            cellHeader.setCellStyle(cellStyle);
            cellHeader = rTwo.createCell(1);
            cellHeader.setCellValue(new XSSFRichTextString(tuple.getDesc()));
            cellHeader.setCellStyle(cellStyle);
            CellRangeAddress region2 = new CellRangeAddress(curRow, curRow, 1, 5);
            setBorderForMergeCell(CellStyle.BORDER_THIN, region1, sheet, workbook);
            sheet.addMergedRegion(region2);
            curRow++;

            // 创建表格标题
            XSSFRow row = sheet.createRow(curRow);

            for (int i = 0; i < headers.length; i++) {
                cellHeader = row.createCell(i);
                cellHeader.setCellStyle(style);
                cellHeader.setCellValue(new XSSFRichTextString(headers[i]));
            }

            // 遍历集合数据，产生数据行
            Iterator<TableDTO> it = datasMap.get(tuple).iterator();
            TableDTO t;
            Field[] fields;
            Field field;
            XSSFRichTextString richString;
            Pattern p = Pattern.compile("^//d+(//.//d+)?$");
            Matcher matcher;
            String fieldName;
            String getMethodName;
            XSSFCell cell;
            Class tCls;
            Method getMethod;
            Object value;
            String textValue;
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            while (it.hasNext()) {
                curRow++;
                row = sheet.createRow(curRow);
                t = it.next();
                // 利用反射，根据JavaBean属性的先后顺序，动态调用getXxx()方法得到属性值
                fields = t.getClass().getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    cell = row.createCell(i);
                    cell.setCellStyle(style2);
                    field = fields[i];
                    fieldName = field.getName();
                    getMethodName = "get" + fieldName.substring(0, 1).toUpperCase()
                            + fieldName.substring(1);
                    try {
                        tCls = t.getClass();
                        getMethod = tCls.getMethod(getMethodName, new Class[]{});
                        value = getMethod.invoke(t, new Object[]{});
                        // 判断值的类型后进行强制类型转换
                        textValue = null;
                        if (value instanceof Integer) {
                            cell.setCellValue((Integer) value);
                        } else if (value instanceof Float) {
                            textValue = String.valueOf((Float) value);
                            cell.setCellValue(textValue);
                        } else if (value instanceof Double) {
                            textValue = String.valueOf((Double) value);
                            cell.setCellValue(textValue);
                        } else if (value instanceof Long) {
                            cell.setCellValue((Long) value);
                        }
                        if (value instanceof Boolean) {
                            textValue = "是";
                            if (!(Boolean) value) {
                                textValue = "否";
                            }
                        } else if (value instanceof Date) {
                            textValue = sdf.format((Date) value);
                        } else {
                            // 其它数据类型都当作字符串简单处理
                            if (value != null) {
                                textValue = value.toString();
                            }
                        }
                        if (textValue != null) {
                            matcher = p.matcher(textValue);
                            if (matcher.matches()) {
                                // 是数字当作double处理
                                cell.setCellValue(Double.parseDouble(textValue));
                            } else {
                                richString = new XSSFRichTextString(textValue);
                                cell.setCellValue(richString);
                            }
                        }
                    } catch (SecurityException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } finally {
                        // 清理资源
                    }
                }

            }
            curRow++;
            curRow++;
            curRow++;
        }
    }

}