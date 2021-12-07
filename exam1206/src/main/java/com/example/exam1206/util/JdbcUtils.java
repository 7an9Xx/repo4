package com.example.exam1206.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;


public class JdbcUtils {
    public static DataSource source=new ComboPooledDataSource("intergalactoApp");

    public static DataSource getDataSource(){
        return source;
    }


}
