/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.bai3cuoikyoop;

/**
 *
 * @author gia khanh
 */
public class NguoiVietNam extends Nguoi{
    private String canCuocCongDan;

    public NguoiVietNam(String hoTen,String gioiTinh,String soDienThoai,String ngaySinh,String canCuocCongDan) {
        super(hoTen,gioiTinh,soDienThoai,ngaySinh);
        this.canCuocCongDan = canCuocCongDan;
    }
    
    public void hienThi(){
        super.hienThi();
        System.out.printf("Can cuoc cong dan: %s\n",this.canCuocCongDan);
        System.out.println("-------------------");
    }
    
    /**
     * @return the canCuocCongDan
     */
    public String getCanCuocCongDan() {
        return canCuocCongDan;
    }

    /**
     * @param canCuocCongDan the canCuocCongDan to set
     */
    public void setCanCuocCongDan(String canCuocCongDan) {
        this.canCuocCongDan = canCuocCongDan;
    }
    
    
}
