package org.example;

import org.example.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main3 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement st = null;
        ResultSet set= null;
        try {
            connection = JdbcUtils.getConnection();
//            st = connection.createStatement();
            String sql = "INSERT INTO user(id,name,password,email,birth) " +
                    "values (?,?,?,?,?)";
            st = connection.prepareStatement(sql);//预编译sql，先写sql，不执行
            //手动给参数赋值
            st.setString(1,"5");
            st.setString(2,"hhh");
            st.setString(3,"321");
            st.setString(4,"432@qq.com");
            st.setString(5,"2023-02-10");
            int num = st.executeUpdate();
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
