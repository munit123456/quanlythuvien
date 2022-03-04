/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import KetnoiSQL.ThuVien;
import java.util.List;
import model.Bao;
import model.Sach;
import model.thuVien;

/**
 *
 * @author Admin
 */
public class Service {
    private ThuVien Sach;
    private ThuVien Bao;
    private ThuVien TapChi;
    
    public Service(){
        Sach = new ThuVien();
        Bao = new ThuVien();
        TapChi = new ThuVien();
    }
    public List<Sach> getALLSACH(){
        return Sach.getALLSACH();
    }
    public void addSach(Sach sach) {
        Sach.addSach(sach);
    }
    public void deleteSach(String MaSach){
        Sach.deleteSach(MaSach);
    }
    /////Bao
    public List<Bao> getALLBao(){
        return Bao.getALLBao();
    }
    public void addBao(Bao bao) {
        Bao.addBao(bao);
    }
    public void deleteBao(int MaBao){
        Bao.deleteBao(MaBao);
    }
    ////TapChi
    public List<thuVien> getALLTapChi(){
        return TapChi.getALLTapChi();
    }
    public void addTapChi(thuVien tapchi) {
        TapChi.addTapChi(tapchi);
    }
    public void deleteTapChi(int MaTC){
        TapChi.deleteTapChi(MaTC);
    }
    
}
