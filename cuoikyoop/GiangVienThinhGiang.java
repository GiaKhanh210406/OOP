/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khanhdev.cuoikyoop;

/**
 *
 * @author gia khanh
 */
public class GiangVienThinhGiang extends GiangVien {
    private String noiCongTacHienTai;

    public GiangVienThinhGiang(String hoTen, String ngaySinh, String hocHam, String hocVi, String ngayBatDau,String noiCongTacHienTai) {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.noiCongTacHienTai = noiCongTacHienTai;
    }

    

    @Override
    public double tinhLuong(){
        return getGioLam() * thuLao;
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("Noi cong tac hien tai: %s\nLuong: %.1f\n",this.noiCongTacHienTai,this.tinhLuong());
        System.out.println("----------------------------");
    }
    /**
     * @return the noiCongTacHienTai
     */
    public String getNoiCongTacHienTai() {
        return noiCongTacHienTai;
    }

    /**
     * @param noiCongTacHienTai the noiCongTacHienTai to set
     */
    public void setNoiCongTacHienTai(String noiCongTacHienTai) {
        this.noiCongTacHienTai = noiCongTacHienTai;
    }

    
}
