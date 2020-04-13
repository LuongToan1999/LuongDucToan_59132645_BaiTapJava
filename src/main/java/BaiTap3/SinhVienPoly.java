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
public abstract class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }
    
    public abstract double getDiem();
    public String getHocLuc(){
      if (getDiem() < 5) return "Yeu";
      else if(5 <= getDiem() && getDiem() < 6.5) return "Trung Binh";
      else if(6.5 <= getDiem() && getDiem() < 7.5) return "Kha";
      else if(7.5 <= getDiem() && getDiem() < 9) return "Gioi";
      return "Xuat sac";
    }
    
    void Xuat(){
        System.out.print("Ho & ten: " +hoTen+ "\nNganh: " +nganh+ "\nDiem: "
                + " "+getDiem()+ "\nHoc luc: "+ getHocLuc());
    }
}
