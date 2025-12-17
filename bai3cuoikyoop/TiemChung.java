/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.bai3cuoikyoop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author gia khanh
 */
public class TiemChung {
    private VacXin vacXin;
    private LocalDate ngayTiem;
    private String diaDiem;

    public TiemChung(VacXin vacXin, LocalDate ngayTiem, String diaDiem) {
        this.vacXin = vacXin;
        this.ngayTiem = ngayTiem;
        this.diaDiem = diaDiem;
    }

    
    public String toString(){
        return vacXin.getTenVacXin() + "-" + ngayTiem.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "-" + diaDiem;
    }
    
    
    /**
     * @return the vacXin
     */
    public VacXin getVacXin() {
        return vacXin;
    }

    /**
     * @param vacXin the vacXin to set
     */
    public void setVacXin(VacXin vacXin) {
        this.vacXin = vacXin;
    }

    /**
     * @return the ngayTiem
     */
    public LocalDate getNgayTiem() {
        return ngayTiem;
    }

    /**
     * @param ngayTiem the ngayTiem to set
     */
    public void setNgayTiem(LocalDate ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

    /**
     * @return the diaDiem
     */
    public String getDiaDiem() {
        return diaDiem;
    }

    /**
     * @param diaDiem the diaDiem to set
     */
    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

   
}
