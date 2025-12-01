package QL_BanHang_TrucTuyen;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DonHang implements Serializable {
    private String maDH;
    private LocalDate ngayDat;
    private String trangThai;
    private double tongTien;
    private KhachHang khachHang;
    private List<ChiTietDonHang> danhSachChiTiet;
    private static final Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner dùng chung cho tất cả các lớp con
    public DonHang() {
        danhSachChiTiet = new ArrayList<>();
    }
    public DonHang(String maDH, LocalDate ngayDat, String trangThai,
                   KhachHang khachHang, List<ChiTietDonHang> danhSachChiTiet) {
        this.maDH = maDH;
        this.ngayDat = ngayDat;
        this.trangThai = trangThai;
        this.khachHang = khachHang;
        this.danhSachChiTiet = danhSachChiTiet;
        tinhTongTien();
    }
    public String getMaDH() {
        return maDH;
    }
    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }
    public LocalDate getNgayDat() {
        return ngayDat;
    }
    public void setNgayDat(LocalDate ngayDat) {
        this.ngayDat = ngayDat;
    }
    public String getTrangThai() {
        return trangThai;
    }
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public double getTongTien() {
        return tongTien;
    }
    public KhachHang getKhachHang() {
        return khachHang;
    }
    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
    public List<ChiTietDonHang> getDanhSachChiTiet() {
        return danhSachChiTiet;
    }
    public void setDanhSachChiTiet(List<ChiTietDonHang> danhSachChiTiet) {
        this.danhSachChiTiet = danhSachChiTiet;
    }
    public void nhap() {
        System.out.print("Ma don hang: ");
        maDH = scanner.nextLine();
        System.out.print("Ngay dat (yyyy-MM-dd): ");
        String dateStr = scanner.nextLine();
        if (dateStr == null || dateStr.isEmpty()) {
            ngayDat = LocalDate.now();
        } else {
            ngayDat = LocalDate.parse(dateStr);
        }
        System.out.print("Trang thai: ");
        trangThai = scanner.nextLine();

        System.out.println("Nhap thong tin khach hang:");
        khachHang = new KhachHang();
        khachHang.nhap();

        System.out.print("Nhap so luong don chi tiet: ");
        int n = Integer.parseInt(scanner.nextLine());
        danhSachChiTiet = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("--- Chi tiet " + (i + 1) + " ---");
            ChiTietDonHang ct = new ChiTietDonHang();
            ct.nhap();
            danhSachChiTiet.add(ct);
        }
        tinhTongTien();
    }
    public void xuat() {
        System.out.println("Ma DH: " + maDH);
        System.out.println("Ngay dat: " + ngayDat);
        System.out.println("Trang thai: " + trangThai);
        System.out.println("Tong tien: " + tongTien);

        System.out.println("=== Thong tin khach hang ===");
        if (khachHang != null) {
            khachHang.xuat();
        }

        System.out.println("=== Danh sach chi tiet ===");
        for (ChiTietDonHang ct : danhSachChiTiet) {
            ct.xuat();
            System.out.println("----------------------");
        }
    }
    public double tinhTongTien() {
        tongTien = 0;
        if (danhSachChiTiet != null) {
            for (ChiTietDonHang ct : danhSachChiTiet) {
                tongTien += ct.getSoLuong() * ct.getGiaTaiThoiDiemDat();
            }
        }
        return tongTien;
    }
}
