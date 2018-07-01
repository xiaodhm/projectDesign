package com.lyq.dbs;
import java.sql.*;
public class DB {
    private final String dbDriver="com.mysql.jdbc.Driver";
    private final String dbUrl="jdbc:mysql://localhost:3306/vote";
    private final String userName="root";
    private final String password="123456";
    private Connection connect=null;
    public DB(){//加载数据库驱动
        try {
            Class.forName(dbDriver);
            connect= DriverManager.getConnection(dbUrl,userName,password);
        }catch (Exception e){
            System.out.println(e);
        }
    }
 public Connection getConnect(){//获得数据库连接
        return this.connect;
  }
    public Statement getStatement(){
        Statement stmt=null;
        try {
            stmt=connect.createStatement();
        }catch(SQLException e){
            e.printStackTrace();
    }
        return stmt;
    }
    public PreparedStatement getPreStatement(String sql){
        PreparedStatement preStmt=null;
        try {
            preStmt=connect.prepareStatement(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return preStmt;
    }
    public void close(){
        try {
            this.connect.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void closeStatement(Statement stmt){
        try{
            if(stmt!=null){
                stmt.close();
                stmt=null;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void closePreparedStatement(PreparedStatement prestmt){
        try{
            if(prestmt!=null){
                prestmt.close();
                prestmt=null;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void closeResult(ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
                rs=null;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
