/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.cuoikyoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author gia khanh
 */

class CoTen{}
class CoHocHam{}
class CoHocVi{}

public class QuanLyGiangVien {
    private List<GiangVien> ql = new ArrayList<>();
    
    public void themGiangVien(GiangVien... gv){
        this.ql.addAll(Arrays.asList(gv));
    }
    
    public void xoaGiangVien(GiangVien gv){
       this.ql.remove(gv);
    }
    
    public List<GiangVien> timKiem(String ten,CoTen co){
        return this.ql.stream().filter(h -> h.getHoTen().contains(ten)).collect(Collectors.toList());
    }
    
    public List<GiangVien> timKiem(String hocHam,CoHocHam co){
        return this.ql.stream().filter(h -> h.getHocHam().contains(hocHam)).collect(Collectors.toList());
    }
    
    public List<GiangVien> timKiem(String hocVi,CoHocVi co){
        return this.ql.stream().filter(h -> h.getHocVi().contains(hocVi)).collect(Collectors.toList());
    }
    
    public void sapXepTheoLuong(){
        this.ql.sort(((a,b) -> Double.compare(b.tinhLuong(), a.tinhLuong())));
    }
    
    public void hienThi(){
        this.ql.forEach(h -> h.hienThi());
    }
    /**
     * @return the ql
     */
    public List<GiangVien> getQl() {
        return ql;
    }

    /**
     * @param ql the ql to set
     */
    public void setQl(List<GiangVien> ql) {
        this.ql = ql;
    }
}
