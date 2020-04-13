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
public class MainBT2 {
    public static void main(String[] args){
        QuanLyNhanVien ds = new QuanLyNhanVien();
        NhanVien NV1 = new NhanVien("Luong Thai An",21,"An Ninh Dong",3500000.0,150);
        NhanVien NV2 = new NhanVien("Luong Thai Quoc",18,"An Ninh Tay",2500000.0,250);
        NhanVien NV3 = new NhanVien("Luong Thai H",20,"An Ninh Tay",3000000.0,200);
        NhanVien NV4 = new NhanVien("Luong Thai T",22,"An Ninh Dong",3300000.0,250);
        NhanVien NV5 = new NhanVien("Luong Thai M",24,"An Ninh Tay",310000.0,90);
        
        ds.them(NV5);
        ds.them(NV4);
        ds.them(NV3);
        ds.them(NV2);
        ds.them(NV1);
        for(int i=0; i<5; i++){
            System.out.println("Nhan Vien Thu "+i);
            ds.NV[i].getThongTin();
        }
    }
}