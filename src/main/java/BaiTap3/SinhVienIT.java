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
public class SinhVienIT extends SinhVienPoly{
    private final double diemJava;
    private final double diemCSS;
    private final double diemHtml;  

    public SinhVienIT(double diemJava, double diemCSS, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2* diemJava + diemCSS + diemHtml)/4;
    }   
}
