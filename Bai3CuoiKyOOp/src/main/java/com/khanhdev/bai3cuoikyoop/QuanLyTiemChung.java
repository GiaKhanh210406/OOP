/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.bai3cuoikyoop;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 *
 * @author gia khanh
 */
public class QuanLyTiemChung {
    private List<VacXin> ql = new ArrayList<>();
    private List<Nguoi> ql2 = new ArrayList<>();
    
    public void themNguoi(Nguoi... nguoi){
        this.ql2.addAll(Arrays.asList(nguoi));
    }
    
    public void ghiNhanTiemChung(Nguoi nd,VacXin vc,LocalDate ngayTiem,String diaDiem){
        LocalDate ngaySinh = LocalDate.parse(nd.getNgaySinh(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int tuoi = Period.between(ngaySinh, ngayTiem).getYears();
        
        if (tuoi < 18){
            System.out.println("Khong du 18 tuoi!");
            return;
        }
        
        if (nd.soMuiDaTiem() >= 3){
            System.out.println("Da tiem du 3 mui!");
            return;
        }
        
        if (nd.soMuiDaTiem() > 0){
            TiemChung tiemGanNhat = nd.getDsTiem().get(nd.soMuiDaTiem()-1);
             if (ChronoUnit.MONTHS.between(tiemGanNhat.getNgayTiem(), ngayTiem) < 3){
                 System.out.println("Chua du 3 thang!");
                 return;
             }
        }
        
        if (vc.getSoLuong() < 0){
            System.out.println("Het vac xin!");
            return;
        }
        
        TiemChung tc = new TiemChung(vc, ngayTiem, diaDiem);
        nd.themMuiTiem(tc);
        vc.setSoLuong(vc.getSoLuong()-1);
        System.out.println("Ghi nhan thanh cong!");
       
    }
            
    public void hienThi2(){
        this.ql2.forEach(h -> h.hienThi());
    }
    public void hienThi1(){
        this.ql.forEach(h -> h.hienThi());
    }
    public void themVacXin(VacXin... vc){
        this.ql.addAll(Arrays.asList(vc));
    }
    
    public List<VacXin> getQl1() {
        return ql;
    }

    public void setQl1(List<VacXin> ql) {
        this.ql = ql;
    }

    /**
     * @return the ql2
     */
    public List<Nguoi> getQl2() {
        return ql2;
    }

    /**
     * @param ql2 the ql2 to set
     */
    public void setQl2(List<Nguoi> ql2) {
        this.ql2 = ql2;
    }
}

