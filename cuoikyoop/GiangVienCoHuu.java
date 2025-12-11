/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.cuoikyoop;

/**
 *
 * @author gia khanh
 */
public class GiangVienCoHuu extends GiangVien {
    private double luongCoBan;
    private double heSoLuong;

    public GiangVienCoHuu(String hoTen, String ngaySinh, String hocHam, String hocVi, String ngayBatDau,double luongCoBan, double heSoLuong) {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double tinhLuong(){
        return getGioLam() * thuLao + luongCoBan * heSoLuong;
    }
   
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("Luong co ban: %.1f\nHe so luong: %.1f\nLuong: %.1f\n",this.luongCoBan,this.heSoLuong,this.tinhLuong());
        System.out.println("----------------------------");
    }
    /**
     * @return the luongCoBan
     */
    public double getLuongCoBan() {
        return luongCoBan;
    }

    /**
     * @param luongCoBan the luongCoBan to set
     */
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    /**
     * @return the heSoLuong
     */
    public double getHeSoLuong() {
        return heSoLuong;
    }

    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

   
    
}
