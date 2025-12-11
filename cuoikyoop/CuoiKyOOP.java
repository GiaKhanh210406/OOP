/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.khanhdev.cuoikyoop;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gia khanh
 */
public class CuoiKyOOP {

    public static void main(String[] args) {
       GiangVienCoHuu gv1 = new GiangVienCoHuu("Nguyen Van A", "01/01/1980", "GS", "TS","01/01/2010", 120,20000);
       GiangVienCoHuu gv2 = new GiangVienCoHuu("Nguyen Van B", "01/01/1981", "GS", "Th.S","01/01/1999", 110,15000);
       
       GiangVienThinhGiang gv3 = new GiangVienThinhGiang("Tran Thi B","02/02/1985","PGS","Thac si","03/03/2022","Thanh pho Ho Chi Minh");
       GiangVienThinhGiang gv4 = new GiangVienThinhGiang("Tran Thi D","02/02/1985","PGS","Thac si","03/03/2022","Thanh pho Ho Chi Minh");
       GiangVienThinhGiang gv5= new GiangVienThinhGiang("Tran Thi F","02/02/1985","PGS","Thac si","03/03/2022","Thanh pho Ho Chi Minh");
       
       QuanLyGiangVien ql = new QuanLyGiangVien();
       ql.themGiangVien(gv1,gv2,gv3,gv4,gv5);
       
       ql.hienThi();
       ql.xoaGiangVien(gv5);
       ql.hienThi();
       
       System.out.println("---Tim Kiem Theo Ten---");
       List<GiangVien> kq = ql.timKiem("Nguyen Van A", new CoTen());
       System.out.println(kq);
       
       System.out.println("---Tim Kiem Theo Hoc Vi---");
       List<GiangVien> kq2 = ql.timKiem("Thac si", new CoHocVi());
       System.out.println(kq2);
       
       System.out.println("---Tim Kiem Theo Hoc Ham---");
       List<GiangVien> kq3 = ql.timKiem("PGS", new CoHocHam());
       System.out.println(kq3);
       
       Scanner sc = new Scanner(System.in);
        
                
       for (GiangVien gv: ql.getQl()){
           System.out.println("Nhap gio lam cua giang vien " + gv.getHoTen() + " : ");
           int gio = sc.nextInt();
           gv.setGioLam(gio);
       }
       
        ql.sapXepTheoLuong();
        System.out.println("---Sap xep theo muc luong giam dan---\n");
        ql.hienThi();
    }
}
