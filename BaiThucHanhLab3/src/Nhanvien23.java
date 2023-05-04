public class Nhanvien23 {
    String hoTen;
    int tuoi;
    double heSoLuong;
    double luongHienTai;
    final double LUONG_CO_BAN = 1490000.0;
    
    public void NhanVien2(String hoTen, int tuoi, double heSoLuong, double luongHienTai) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.heSoLuong = heSoLuong;
    this.luongHienTai = luongHienTai;
    }
    
    public double tinhLuong() {
    double luong = heSoLuong * LUONG_CO_BAN;
    return luong;
    }
    
    public void hienThiThongTin() {
    System.out.println("Họ tên nhân viên: " + hoTen);
    System.out.println("Tuổi nhân viên: " + tuoi);
    System.out.println("Hệ số lương nhân viên: " + heSoLuong);
    System.out.println("Lương hiện tại nhân viên: " + luongHienTai);
    System.out.println("Lương cơ bản: " + LUONG_CO_BAN);
    System.out.println("Lương của nhân viên: " + tinhLuong());
    }



    public class Nhanvien {
    public static void main(String[] args) {
    App23 nhanVien2 = new App23();
    nhanVien2.hienThiThongTin();
    }
    }
}