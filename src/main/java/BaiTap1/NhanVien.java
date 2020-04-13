package BaiTap1;

public class NhanVien {
    String Ten;
    int Tuoi;
    String DiaChi;
    double TienLuong;
    int SoGioLam;

    public NhanVien() {
    }

    public NhanVien(String Ten, int Tdxuoi, String DiaChi, double TienLuong,
        int SoGioLam) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TienLuong = TienLuong;
        this.SoGioLam = SoGioLam;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public int getSoGioLam() {
        return SoGioLam;
    }

    public void setSoGioLam(int SoGioLam) {
        this.SoGioLam = SoGioLam;
    }

    /**
     *
     */
    public void getThongTin() {
        System.out.println("Ho & Ten: "+Ten);
        System.out.println("Tuoi: "+Tuoi);
        System.out.println("Dia Chi: "+DiaChi);
        System.out.println("Tien Luong: "+TienLuong);
        System.out.println("So Gio Lam: "+SoGioLam);
        System.out.println("Tien Thuong: "+tinhThuong());
    }
    
    public double tinhThuong(){
        if (SoGioLam >= 200)
            return TienLuong * 0.2;
        if (SoGioLam >= 100 && SoGioLam < 200)
            return TienLuong * 0.1;
        return 0;
    }
}