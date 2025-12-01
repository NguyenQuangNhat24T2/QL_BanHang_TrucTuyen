package QL_BanHang_TrucTuyen;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        QuanLySanPham qlsp = new QuanLySanPham();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU CHINH =====");
            System.out.println("1. Quan ly san pham");
            System.out.println("2. Nhap don hang");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    menuSanPham(qlsp, scanner);
                    break;

                case 2: {
                    DonHang dh = new DonHang();
                    dh.nhap();
                    dh.xuat();
                    break;
                }
                case 0:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }

    public static void menuSanPham(QuanLySanPham ql, Scanner scanner) {
        int c;
        do {
            System.out.println("----- Quan ly san pham -----");
            System.out.println("1. Them san pham gia dung");
            System.out.println("2. Them san pham dien tu");
            System.out.println("3. Xuat danh sach");
            System.out.println("4. Tim san pham");
            System.out.println("5. Xoa san pham");
            System.out.println("0. Quay lai");
            System.out.print("Chon: ");
            c = Integer.parseInt(scanner.nextLine());

            switch (c) {
                case 1: {
                    SanPhamGiaDung sp = new SanPhamGiaDung();
                    sp.nhap();
                    ql.them(sp);
                    break;
                }
                case 2: {
                    SanPhamDienTu sp = new SanPhamDienTu();
                    sp.nhap();
                    ql.them(sp);
                    break;
                }
                case 3:
                    ql.xuatDanhSach();
                    break;

                case 4:
                    System.out.print("Nhap ma SP: ");
                    String ma = scanner.nextLine();
                    SanPham sp = ql.timKiem(ma);
                    if (sp != null) sp.xuat();
                    else System.out.println("Khong tim thay!");
                    break;

                case 5:
                    System.out.print("Nhap ma SP de xoa: ");
                    String x = scanner.nextLine();
                    ql.xoa(x);
                    break;
            }
        } while (c != 0);
    }
}
