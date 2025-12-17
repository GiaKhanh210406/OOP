/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.bai3cuoikyoop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gia khanh
 */
public abstract class Nguoi {
    private String hoTen;
    private String gioiTinh;
    private String soDienThoai;
    private String ngaySinh;
    private List<TiemChung> dsTiem = new ArrayList<>();
    
    public void themMuiTiem(TiemChung tc){
        dsTiem.add(tc);
    }
    
    public int soMuiDaTiem(){
        return dsTiem.size();
    }
    public void hienThi(){
        System.out.printf("Ho va ten: %s\nGioi tinh: %s\nSo dien thoai: %s\nNgay sinh: %s\n",this.hoTen,this.gioiTinh,this.soDienThoai,this.ngaySinh);
    }

    public Nguoi(String hoTen, String gioiTinh, String soDienThoai, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
    }
    
    
    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the soDienThoai
     */
    public String getSoDienThoai() {
        return soDienThoai;
    }

    /**
     * @param soDienThoai the soDienThoai to set
     */
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    /**
     * @return the ngaySinh
     */
    public String getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the dsTiem
     */
    public List<TiemChung> getDsTiem() {
        return dsTiem;
    }

    /**
     * @param dsTiem the dsTiem to set
     */
    public void setDsTiem(List<TiemChung> dsTiem) {
        this.dsTiem = dsTiem;
    }
    
}
