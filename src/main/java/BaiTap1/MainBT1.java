/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Luong Toan
 */
public class MainBT1 {
    public static void main(String[] args) {
    
        NhanVien NhanVien1 = new NhanVien();
        NhanVien1.Ten = "Luong Duc Toan";
        NhanVien1.Tuoi = 21;
        NhanVien1.DiaChi = "Phu Hoi - An Ninh Dong - Tuy An - Phu Yen";
        NhanVien1.TienLuong = 3000000;
        NhanVien1.SoGioLam = 300;

        System.out.println("Thong Tin Nhan Vien 1: ");
        NhanVien1.getThongTin();
   
    }
}
