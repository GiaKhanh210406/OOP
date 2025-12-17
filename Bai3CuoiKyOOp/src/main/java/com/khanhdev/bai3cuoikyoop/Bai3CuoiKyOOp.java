/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.khanhdev.bai3cuoikyoop;

import java.time.LocalDate;

/**
 *
 * @author gia khanh
 */
public class Bai3CuoiKyOOp {

    public static void main(String[] args) {
        VacXin vc1 = new VacXin("Pfizer–BioNTech", "My", 500);
        VacXin vc2 = new VacXin("PModerna", "My", 300);
        VacXin vc3 = new VacXin("AstraZeneca", "Anh", 150);

        QuanLyTiemChung ql = new QuanLyTiemChung();
        ql.themVacXin(vc1, vc2, vc3);
        System.out.println("---Danh sach cac loai vac xin---");
        ql.hienThi1();
        
        Nguoi n1 = new NguoiNuocNgoai("Tom", "Man", "0123", "21/04/2000", "C1234567", "My");
        Nguoi n2 = new NguoiNuocNgoai("John", "Man", "0123456", "21/09/1999", "C12121212", "Anh");
        QuanLyTiemChung ql2 = new QuanLyTiemChung();
        ql2.themNguoi(n1,n2);
        System.out.println("---Danh sach nguoi nuoc ngoai---");
        ql2.hienThi2();
        
        ql.ghiNhanTiemChung(n1, vc3, LocalDate.of(2023,1,1), "Benh vien Cho Ray");
        ql.ghiNhanTiemChung(n1, vc3, LocalDate.of(2023,4,1), "Benh vien Cho Ray");
        ql.ghiNhanTiemChung(n1, vc3, LocalDate.of(2023,2,1), "Benh vien Cho Ray");
        System.out.println("---Danh sach tiem chung---");
        n1.getDsTiem().forEach(System.out::println);
    }
}
