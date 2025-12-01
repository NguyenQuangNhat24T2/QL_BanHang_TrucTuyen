package QL_BanHang_TrucTuyen;
public class SanPhamDienTu extends SanPham {
    private String congSuat;
    private int dienAp;
    public SanPhamDienTu() {
        super();
    }
    public SanPhamDienTu(String maSP, String tenSP, double giaBan,
                         String nhaCungCap, String congSuat, int dienAp) {
        super(maSP, tenSP, giaBan, nhaCungCap);
        this.congSuat = congSuat;
        this.dienAp = dienAp;
    }
    public String getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }
    public int getDienAp() {
        return dienAp;
    }
    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Cong suat: ");
        congSuat = scanner.nextLine();
        System.out.print("Dien ap: ");
        dienAp = Integer.parseInt(scanner.nextLine()); //đọc chuỗi và chuyển về số nguyên sau đó gán cho biến dienAp
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Cong suat: " + congSuat);
        System.out.println("Dien ap: " + dienAp);
    }
}
