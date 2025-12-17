/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.bai3cuoikyoop;

/**
 *
 * @author gia khanh
 */
public class VacXin {
    private static int dem;
    private int ma = ++dem;
    private String tenVacXin;
    private String xuatXu;
    private int soLuong;

    public VacXin(String tenVacXin, String xuatXu, int soLuong) {
        this.tenVacXin = tenVacXin;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }
    
    
    
    public void hienThi(){
        System.out.printf("Ma vac xin: %d\nTen vac xin: %s\nXuat xu: %s\nSo luong: %d\n",this.ma,this.tenVacXin,this.xuatXu,this.soLuong);
        System.out.println("------------------------");
    }

    /**
     * @return the ma
     */
    public int getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(int ma) {
        this.ma = ma;
    }

    /**
     * @return the maVacXin
     */
    public String getTenVacXin() {
        return tenVacXin;
    }

    /**
     * @param maVacXin the maVacXin to set
     */
    public void setTenVacXin(String tenVacXin) {
        this.tenVacXin = tenVacXin;
    }

    /**
     * @return the xuatXu
     */
    public String getXuatXu() {
        return xuatXu;
    }

    /**
     * @param xuatXu the xuatXu to set
     */
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
