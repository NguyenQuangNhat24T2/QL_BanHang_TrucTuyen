package QL_BanHang_TrucTuyen;
import java.io.Serializable; //cho phép ghi và đọc đối tượng vào/ra file
import java.util.Scanner;
public abstract class SanPham implements Serializable {
    protected String maSP;
    protected String tenSP;
    protected double giaBan;
    protected String nhaCungCap;
    protected static final Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner dùng chung cho tất cả các lớp con
    public SanPham() {
    }
    public SanPham(String maSP, String tenSP, double giaBan, String nhaCungCap) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.nhaCungCap = nhaCungCap;
    }
    public String getMaSP() {
        return maSP;
    }
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public double getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public String getNhaCungCap() {
        return nhaCungCap;
    }
    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
    public void nhap() {
        System.out.print("Ma san pham: ");
        maSP = scanner.nextLine();

        System.out.print("Ten san pham: ");
        tenSP = scanner.nextLine();

        System.out.print("Gia ban: ");
        giaBan = Double.parseDouble(scanner.nextLine());

        System.out.print("Nha cung cap: ");
        nhaCungCap = scanner.nextLine();
    }
    public void xuat() {
        System.out.println("Ma SP: " + maSP);
        System.out.println("Ten SP: " + tenSP);
        System.out.println("Gia ban: " + giaBan);
        System.out.println("Nha cung cap: " + nhaCungCap);
        System.out.println("Thue: " + tinhThue());
    }
    public double tinhThue() {
        // vi du: thue 10% gia ban
        return giaBan * 0.10;
    }
}
