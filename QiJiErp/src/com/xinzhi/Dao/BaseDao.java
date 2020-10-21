package com.xinzhi.Dao;

import java.sql.*;

public class BaseDao {
    public static Connection GetConn(){
        Connection conn= null;
        try {
            Class.forName("com.jdbc.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qijierp","root","root");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeAll(ResultSet rs, Statement stat, Connection conn){
        try {
            if(rs != null)
                rs.close();
            if(stat != null)
                stat.close();
            if(conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
