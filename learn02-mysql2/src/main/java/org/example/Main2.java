package org.example;

import org.example.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main2 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        ResultSet set= null;
        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            String sql = "INSERT INTO user(id,name,password,email,birth) values(\"4\",\"j12ing\",\"333\",\"223@qq.com\",\"2011-02-12\");\n";
            int num = st.executeUpdate(sql);
            if(num>0){
                System.out.println("插入成功");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.release(connection,st,set);
        }
    }
}
