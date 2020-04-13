/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author Luong Toan
 */
public class QuanLyNhanVien implements IQuanLy{
    NhanVien[] NV = new NhanVien [100];
    int n = 0;
    
    @Override
    public void them(NhanVien nv){
        NV[n] = new NhanVien();
        NV[n] = nv;
        n++;
    }

    @Override
    public void inDS() {
        for(int i=0; i<n; i++){
            System.out.println("Nhan Vien Thu "+ i);
        NV[i].getThongTin();
        }
    }
    
}