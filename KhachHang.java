package QL_BanHang_TrucTuyen;
import java.io.Serializable;
import java.util.Scanner;
public class KhachHang implements Serializable {
    private String maKH;
    private String hoTen;
    private String email;
    private String sdt;
    private DiaChi diaChi;
    private static final Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner dùng chung cho tất cả các lớp con
    public KhachHang() {
        diaChi = new DiaChi();
    }
    public KhachHang(String maKH, String hoTen, String email, String sdt, DiaChi diaChi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }
    public String getMaKH() {
        return maKH;
    }
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public DiaChi getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }
    public void nhap() {
        System.out.print("Ma khach hang: ");
        maKH = scanner.nextLine();

        System.out.print("Ho ten: ");
        hoTen = scanner.nextLine();

        System.out.print("Email: ");
        email = scanner.nextLine();

        System.out.print("So dien thoai: ");
        sdt = scanner.nextLine();

        System.out.println("Nhap dia chi:");
        if (diaChi == null) {
            diaChi = new DiaChi();
        }
        diaChi.nhap();
    }
    public void xuat() {
        System.out.println("Ma KH: " + maKH);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("So dien thoai: " + sdt);
        System.out.print("Dia chi: ");
        if (diaChi != null) {
            diaChi.xuat();
        } else {
            System.out.println("Chua co");
        }
    }
    public void dangKy() {
        System.out.println("Khach hang " + hoTen + " dang ky thanh cong.");
    }
}
