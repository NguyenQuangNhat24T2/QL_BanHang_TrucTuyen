package QL_BanHang_TrucTuyen;
import java.io.Serializable;
import java.util.Scanner;
public class DiaChi implements Serializable {
    private String soNha;
    private String duong;
    private String phuongXa;
    private String tinhThanh;
    private static final Scanner scanner = new Scanner(System.in); //khai báo đối tượng scanner dùng chung cho tất cả các lớp con
    public DiaChi() {
    }
    public DiaChi(String soNha, String duong, String phuongXa, String tinhThanh) {
        this.soNha = soNha;
        this.duong = duong;
        this.phuongXa = phuongXa;
        this.tinhThanh = tinhThanh;
    }
    public String getSoNha() {
        return soNha;
    }
    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }
    public String getDuong() {
        return duong;
    }
    public void setDuong(String duong) {
        this.duong = duong;
    }
    public String getPhuongXa() {
        return phuongXa;
    }
    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }
    public String getTinhThanh() {
        return tinhThanh;
    }
    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }
    public void nhap() {
        System.out.print("So nha: ");
        soNha = scanner.nextLine();

        System.out.print("Duong: ");
        duong = scanner.nextLine();

        System.out.print("Phuong/xa: ");
        phuongXa = scanner.nextLine();

        System.out.print("Tinh/thanh: ");
        tinhThanh = scanner.nextLine();
    }
    public void xuat() {
        System.out.println(soNha + ", " + duong + ", " + phuongXa + ", " + tinhThanh);
    }
}
