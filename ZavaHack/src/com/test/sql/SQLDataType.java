package com.test.sql;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class SQLDataType {
	
	
  public static void main(String[] argv) throws Exception {
    String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    Class.forName(driverName);


    String url = "jdbc:sqlserver://laptop08;instanceName=MSSQLSERVER1;databasename=MSODLoadingOSSTest;SelectMethod=cursor";
    String username = "sa";
    String password = "Fundw0rk51";

    Connection connection = DriverManager.getConnection(url, username, password);
    DatabaseMetaData dbmd = connection.getMetaData();
    ResultSet resultSet = dbmd.getTypeInfo();
    Map<String, Integer> dataTypeMap = new HashMap<String, Integer>();
    while (resultSet.next()) {
      String typeName = resultSet.getString("TYPE_NAME");
      //System.out.println(typeName);
      int dataType = resultSet.getInt("DATA_TYPE");
      //System.out.println(dataType);
      dataTypeMap.put(typeName, dataType);
    }
    //System.out.println(getJdbcTypeName().get(StringUtils.upperCase("nvarchar")));
    //System.out.println(StringUtils.upperCase("gaurav"));
    System.out.println(dataTypeMap);
  }

  public static  Map<String, Integer> getJdbcTypeName() {
    Map<String, Integer> map = new HashMap<String, Integer>();

    // Get all field in java.sql.Types
    Field[] fields = java.sql.Types.class.getFields();
    for (int i = 0; i < fields.length; i++) {
      try {
        String name = fields[i].getName();
       // System.out.println(name);
        Integer value = (Integer) fields[i].get(null);
        map.put(name, value);
      } catch (IllegalAccessException e) {
      }
    }
    System.out.println(map);
    return map;
  }

}