package com.tdtk.dao;

import com.tdtk.model.UsrVo;
import com.tdtk.utils.MySQLUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsrDAO {
    
    /**
     * 根据用户查询密码
     * @param name
     */
    public UsrVo query(String name) {
        Connection connection = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        UsrVo usrVo=new UsrVo();
        try {
            connection = MySQLUtils.getConnection();
//            String sql = "SELECT * from  manager where mng_name='momo'";
            String sql = "SELECT DISTINCT manager.mng_id,mng_name,mng_psw,prc_id from  privileg " +
                    " LEFT JOIN manager on privileg.mng_id=manager.mng_id where mng_name=?";
            psmt = connection.prepareStatement(sql);
           psmt.setString(1, name);

            rs = psmt.executeQuery();
            while(rs.next()) {
                System.out.println("我要返回结果了===================");

               usrVo.setMng_name(rs.getString("mng_name")+"");
               usrVo.setMng_id(Integer.valueOf(rs.getLong("mng_id")+""));
               usrVo.setMng_psw(rs.getString("mng_psw")+"");
               usrVo.setPrc_id(Integer.valueOf(rs.getLong("prc_id")+""));
            }
            
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySQLUtils.release(connection, psmt, rs);
        }
        return usrVo;
    }
    
    // 查询用户信息
    public UsrVo queryAll(String name) {
        Connection connection = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        UsrVo usrVo=new UsrVo();
        try {
            connection = MySQLUtils.getConnection();
            String sql = "";
            psmt = connection.prepareStatement(sql);
            psmt.setString(1, name);
            
            rs = psmt.executeQuery();
            while(rs.next()) {
                System.out.println("我要返回结果了===================");
            }
            
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySQLUtils.release(connection, psmt, rs);
        }
        return usrVo;
    }
    public static void main(String[] args) {
    
    }

}
