/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Luong Toan
 */
public class MainBT3 {
    public static void main(String[] args) {
        SinhVienPoly SV1 = new SinhVienIT(7,9,6,"Luong Duc Toan","CNTT");
        System.out.println("Thong tin sinh vien 1:");
        SV1.Xuat();
        
        SinhVienPoly SV2 = new SinhVienIT(8,5,6,"Luong Thai Quoc","CNTT");
        System.out.println("\nThông tin sinh vien 2:");
        SV2.Xuat();
        
        SinhVienPoly SV3 = new SinhVienBiz(8,6,"Luong Thai An","Marketing");
        System.out.println("\nThông tin sinh vien 3:");
        SV3.Xuat();
    }
}
