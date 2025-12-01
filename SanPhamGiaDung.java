package QL_BanHang_TrucTuyen;
public class SanPhamGiaDung extends SanPham {
    private String thoiGianBaoHanh;
    public SanPhamGiaDung() {
        super();
    }
    public SanPhamGiaDung(String maSP, String tenSP, double giaBan,
                          String nhaCungCap, String thoiGianBaoHanh) {
        super(maSP, tenSP, giaBan, nhaCungCap);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Thoi gian bao hanh: ");
        thoiGianBaoHanh = scanner.nextLine();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh);
    }
}
