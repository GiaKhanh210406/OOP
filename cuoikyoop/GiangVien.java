/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.cuoikyoop;

/**
 *
 * @author gia khanh
 */
public abstract class GiangVien {
    private String hoTen;
    private String ngaySinh;
    private String hocHam;
    private String hocVi;
    private String ngayBatDau;
    private int gioLam;
    public static double thuLao = 90000;
    
    public abstract double tinhLuong();
    
    public void hienThi(){
        System.out.printf("Ho va ten: %S\nNgay sinh: %s\nHoc ham: %s\nHoc vi: %s\nNgay bat dau lam viec: %S\nSo gio lam: %d\n",this.hoTen,this.ngaySinh,this.hocHam,this.hocVi,this.ngayBatDau, this.getGioLam());
    }

    public GiangVien(String hoTen, String ngaySinh, String hocHam, String hocVi, String ngayBatDau) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDau = ngayBatDau;
        
    }
    
    @Override
    public String toString() {
        return "Ho ten: " + hoTen
                + ", Hoc ham: " + hocHam
                + ", Hoc vi: " + hocVi + "\n";
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
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the ngayBatDau
     */
    public String getNgayBatDau() {
        return ngayBatDau;
    }

    /**
     * @param ngayBatDau the ngayBatDau to set
     */
    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    /**
     * @return the gioLam
     */
    public int getGioLam() {
        return gioLam;
    }

    /**
     * @param gioLam the gioLam to set
     */
    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }

    /**
     * @return the gioLam
     */
   
}
