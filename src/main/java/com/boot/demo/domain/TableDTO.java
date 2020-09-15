package com.boot.demo.domain;

import lombok.Data;

@Data
public class TableDTO {
    private String column_name;
    private String column_comment;
    private String column_type;
    private String is_nullable;
    private String def_val;
    private String menu_val;

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    public String getColumn_comment() {
        return column_comment;
    }

    public void setColumn_comment(String column_comment) {
        this.column_comment = column_comment;
    }

    public String getColumn_type() {
        return column_type;
    }

    public void setColumn_type(String column_type) {
        this.column_type = column_type;
    }

    public String getIs_nullable() {
        return is_nullable;
    }

    public void setIs_nullable(String is_nullable) {
        this.is_nullable = is_nullable;
    }

    public String getDef_val() {
        return def_val;
    }

    public void setDef_val(String def_val) {
        this.def_val = def_val;
    }

    public String getMenu_val() {
        return menu_val;
    }

    public void setMenu_val(String menu_val) {
        this.menu_val = menu_val;
    }
}