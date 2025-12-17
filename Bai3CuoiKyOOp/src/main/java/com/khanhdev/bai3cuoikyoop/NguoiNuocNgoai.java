/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.bai3cuoikyoop;

/**
 *
 * @author gia khanh
 */
public class NguoiNuocNgoai extends Nguoi{
    private String hoChieu;
    private String quocTich;

    public NguoiNuocNgoai(String hoTen, String gioiTinh, String soDienThoai, String ngaySinh,String hoChieu, String quocTich) {
        super(hoTen, gioiTinh, soDienThoai, ngaySinh);
        this.hoChieu = hoChieu;
        this.quocTich = quocTich;
    }
    
    public void hienThi(){
        super.hienThi();
        System.out.printf("Ho chieu: %s\nQuoc Tich: %s\n",this.hoChieu,this.quocTich);
        System.out.println("-------------------");
    }
    

    /**
     * @return the hoChieu
     */
    public String getHoChieu() {
        return hoChieu;
    }

    /**
     * @param hoChieu the hoChieu to set
     */
    public void setHoChieu(String hoChieu) {
        this.hoChieu = hoChieu;
    }

    /**
     * @return the quocTich
     */
    public String getQuocTich() {
        return quocTich;
    }

    /**
     * @param quocTich the quocTich to set
     */
    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
    
}
