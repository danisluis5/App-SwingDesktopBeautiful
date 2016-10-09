/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import bean.Customer;
import bean.Floor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.LibraryConnectDb;

/**
 *
 * @author vuongluis
 */
public class ModelKhachHang {
    private LibraryConnectDb lcdb;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection conn;
    
    public ModelKhachHang(){
        lcdb = new LibraryConnectDb();
    }
    
    public ArrayList<Customer> getList(){
        ArrayList<Customer> alItem = new ArrayList<>();
        String sql = "SELECT * FROM khachhang";

        conn = lcdb.getConnectMySQL();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                alItem.add(new Customer(rs.getInt("makh"),rs.getString("tenkhachhang"), rs.getString("socmt"),rs.getString("thudientu"),rs.getString("diachi"),rs.getString("nghenghiep"),rs.getString("sodienthoai"),rs.getString("quoctich"),rs.getInt("matv")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelTang.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModelTang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return alItem;
    }
    
     public Customer getItem(int cid) {
        conn = lcdb.getConnectMySQL();
        Customer c = null;
        String sql = "SELECT * FROM customer WHERE makh = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cid);
            rs = pst.executeQuery();
            if (rs.next()) {
                c = new Customer(rs.getInt("makh"),rs.getString("tenkhachhang"), rs.getString("socmt"),rs.getString("thudientu"),rs.getString("diachi"),rs.getString("nghenghiep"),rs.getString("sodienthoai"),rs.getString("quoctich"),rs.getInt("matv"));
            }
        } catch (SQLException e) {
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return c;
    }
     
    public int addItem(Customer item) {
        int result = 0;
        conn = lcdb.getConnectMySQL();

        String sql = "INSERT INTO khachhang(tenkhachhang,socmt,thudientu,diachi,nghenghiep,sodienthoai,quoctich,matv) VALUES (?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1,item.getTenKhachHang());
            pst.setString(2, item.isSoCMT());
            pst.setString(3, item.getThuDienTu());
            pst.setString(4, item.getDiaChi());
            pst.setString(5, item.getNgheNghiep());
            pst.setString(6, item.getSoDienThoai());
            pst.setString(7, item.getQuocTich());
            pst.setInt(8, item.getMaTV());
            pst.executeUpdate();
            rs = pst.getGeneratedKeys();
            if(rs.next()){
                result = rs.getInt(1);
            }
        } catch (SQLException e) {
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }
    
    public int editItem(Floor c) {
        int result = 0;
        conn = lcdb.getConnectMySQL();
        String sql = "UPDATE tang SET tang=?,sotang = ? WHERE mat=? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, c.getTang());
            pst.setInt(2, c.getSoPhong());
            pst.setInt(3, c.getMaT());
            pst.executeUpdate();
            result = c.getTang();
        } catch (SQLException e) {
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }
    
    public int delItem(int cid) {
        int result = 0;
        conn = lcdb.getConnectMySQL();

        String sql = "DELETE FROM tang WHERE mat = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, cid);
            pst.executeUpdate();
            result = 1;
        } catch (SQLException e) {
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }
}
