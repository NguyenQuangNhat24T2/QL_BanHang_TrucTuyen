package QL_BanHang_TrucTuyen;
import java.io.Serializable;
import java.util.Scanner;
public class ChiTietDonHang implements Serializable {
    private int soLuong;
    private double giaTaiThoiDiemDat;
    private SanPham sanPham;
    private static final Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner dùng chung cho tất cả các lớp con
    public ChiTietDonHang() {
    }
    public ChiTietDonHang(SanPham sanPham, int soLuong, double giaTaiThoiDiemDat) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.giaTaiThoiDiemDat = giaTaiThoiDiemDat;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public double getGiaTaiThoiDiemDat() {
        return giaTaiThoiDiemDat;
    }
    public void setGiaTaiThoiDiemDat(double giaTaiThoiDiemDat) {
        this.giaTaiThoiDiemDat = giaTaiThoiDiemDat;
    }
    public SanPham getSanPham() {
        return sanPham;
    }
    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
    public void nhap() {
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap gia tai thoi diem dat: ");
        giaTaiThoiDiemDat = Double.parseDouble(scanner.nextLine());
    }
    public void xuat() {
        System.out.println("So luong: " + soLuong);
        System.out.println("Gia tai thoi diem dat: " + giaTaiThoiDiemDat);
        if (sanPham != null) {
            System.out.println("Thong tin san pham:");
            sanPham.xuat();
        }
    }
}
