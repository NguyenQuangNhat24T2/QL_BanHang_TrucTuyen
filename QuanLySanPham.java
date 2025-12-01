package QL_BanHang_TrucTuyen;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class QuanLySanPham implements IDataService, Serializable {
    private List<SanPham> danhSachSP;
    private static final String DATA_FILE = "sanpham.dat";
    public QuanLySanPham() {
        danhSachSP = new ArrayList<>();
    }
    public List<SanPham> getDanhSachSP() {
        return danhSachSP;
    }
    public void them(SanPham sp) {
        if (sp != null) {
            danhSachSP.add(sp);
        }
    }
    public void xoa(String maSP) {
        if (maSP == null) {
            return;
        }
        Iterator<SanPham> it = danhSachSP.iterator();
        while (it.hasNext()) {
            SanPham sp = it.next();
            if (maSP.equalsIgnoreCase(sp.getMaSP())) {
                it.remove();
                break;
            }
        }
    }
    public SanPham timKiem(String maSP) {
        if (maSP == null) {
            return null;
        }
        for (SanPham sp : danhSachSP) {
            if (maSP.equalsIgnoreCase(sp.getMaSP())) {
                return sp;
            }
        }
        return null;
    }
    public void xuatDanhSach() {
        System.out.println("===== DANH SACH SAN PHAM =====");
        for (SanPham sp : danhSachSP) {
            sp.xuat();
            System.out.println("---------------------------");
        }
    }
    // luu bat ky doi tuong ra file mac dinh
    @Override
    public boolean luu(Object obj) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(obj);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    // tai doi tuong tu file source (duong dan file)
    @Override
    public Object tai(String source) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(source))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
