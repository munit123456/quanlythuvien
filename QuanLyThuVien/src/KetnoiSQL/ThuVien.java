/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetnoiSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bao;
import model.Sach;
import model.thuVien;

/**
 *
 * @author Admin
 */
public class ThuVien {
    public List<Sach> getALLSACH(){
        List<Sach> bosach = new ArrayList<Sach>();
        
        Connection connection = Connect.getJDBCConnection();
        
        String sql = "SELECT * FROM sach";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                Sach sach = new Sach();
                
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setTenTGS(rs.getString("TenTG"));
                sach.settenNXBS(rs.getString("tenNXB"));
                sach.setsoBPHS(rs.getInt("soBPH"));
                sach.setsoTrangS(rs.getInt("soTrang"));
                              
                bosach.add(sach);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(ThuVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bosach;
    }
    public void addSach(Sach sach){
        Connection connection = Connect.getJDBCConnection();

        String sql = "INSERT INTO sach(MaSach, TenSach, TenTG, tenNXB, soBPH, soTrang) VALUE(? , ? , ? , ? , ? , ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sach.getMaSach());
            preparedStatement.setString(2, sach.getTenSach());
            preparedStatement.setString(3, sach.getTenTGS());
            preparedStatement.setString(4, sach.gettenNXBS());
            preparedStatement.setInt(5, sach.getsoBPHS());
            preparedStatement.setInt(6, sach.getsoTrangS());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException ex) {
            Logger.getLogger(ThuVien.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void deleteSach(String MaSach){
        Connection connection = Connect.getJDBCConnection();

        String sql = "delete from sach where MaSach = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,MaSach);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException ex) {
            Logger.getLogger(ThuVien.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    ///////////////////////////////////////////Bao
    public List<Bao> getALLBao(){
        List<Bao> boBao = new ArrayList<Bao>();
        
        Connection connection = Connect.getJDBCConnection();
        
        String sql = "SELECT * FROM bao";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                Bao bao = new Bao();
                
                bao.setMaBao(rs.getInt("MaBao"));
                bao.setTenB(rs.getString("TenB"));
                bao.setTenNXB(rs.getString("TenNXB"));
                bao.setSoBPHB(rs.getInt("SoBPH"));
                bao.setNgayPHB(rs.getString("NgayPH"));
                              
                boBao.add(bao);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(ThuVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return boBao;
    }
    public void addBao(Bao bao){
        Connection connection = Connect.getJDBCConnection();

        String sql = "INSERT INTO bao(MaBao, TenB, TenNXB, SoBPH, NgayPH) VALUE( ? , ? , ? , ? , ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, bao.getMaBao());
            preparedStatement.setString(2, bao.getTenB());
            preparedStatement.setString(3, bao.getNXB());
            preparedStatement.setInt(4, bao.getSoBPH());
            preparedStatement.setString(5, bao.getNgayPHB());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException ex) {
            Logger.getLogger(ThuVien.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void deleteBao(int MaBao){
        Connection connection = Connect.getJDBCConnection();

        String sql = "delete from bao where MaTC = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,MaBao);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException ex) {
            Logger.getLogger(ThuVien.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    /////////////////////////Tap Chi
    
    public List<thuVien> getALLTapChi(){
        List<thuVien> botapchi = new ArrayList<thuVien>();
        
        Connection connection = Connect.getJDBCConnection();
        
        String sql = "SELECT * FROM tapchi";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                thuVien tapchi = new thuVien();
                
                tapchi.setMaTC(rs.getInt("MaTC"));
                tapchi.setTenTC(rs.getString("TenTC"));
                tapchi.settenNXBTC(rs.getString("TenNXB"));
                tapchi.setSoBPHTC(rs.getInt("SoBPH"));
                tapchi.setSoPHTC(rs.getString("SoPH"));
                tapchi.setThangPHTC(rs.getString("ThangPH"));
                
                
//                public int MaTC;
//                public String TenTC;
//                public String tenNXBTC;
//                public int SoBPHTC;
//                public String SoPHTC;
//                public String ThangPHTC;
                botapchi.add(tapchi);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(ThuVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return botapchi;
    }
    public void addTapChi(thuVien tapchi){
        Connection connection = Connect.getJDBCConnection();

        String sql = "INSERT INTO tapchi(MaTC, TenTC, tenNXB, SoBPH, SoPH, ThangPH) VALUE(? , ? , ? , ? , ? , ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, tapchi.getMaTC());
            preparedStatement.setString(2, tapchi.getTenTC());
            preparedStatement.setString(3, tapchi.gettenNXBTC());
            preparedStatement.setInt(4, tapchi.getSoBPHTC());
            preparedStatement.setString(5, tapchi.getSoPHTC());
            preparedStatement.setString(6, tapchi.getThangPHTC());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException ex) {
            Logger.getLogger(ThuVien.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public void deleteTapChi(int MaTC){
        Connection connection = Connect.getJDBCConnection();

        String sql = "delete from tapchi where MaTC = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,MaTC);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException ex) {
            Logger.getLogger(ThuVien.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
