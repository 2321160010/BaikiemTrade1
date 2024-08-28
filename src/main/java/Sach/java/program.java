/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sach.java;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        QuanLySach quanLySach;
        quanLySach = new QuanLySach();
        int luaChon;

        do {
            System.out.println("1. Hien thi danh sach sach");
            System.out.println("2. Sach xuat ban truoc nam 2015");
            System.out.println("3. Tim sach theo ten");
            System.out.println("4. Sap xep sach theo gia");
            System.out.println("5. Xoa sach theo ma sach");
            System.out.println("6. Sua gia bia theo ma sach");
            System.out.println("7. Tinh tong tri gia");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (luaChon) {
                case 1:
                    quanLySach.hienThiDanhSach();
                    break;
                case 2:
                    quanLySach.sachTruocNam(2015);
                    break;
                case 3:
                    System.out.print("Nhap ten sach: ");
                    String tenSach = scanner.nextLine();
                    quanLySach.sachTheoTen(tenSach);
                    break;
                case 4:
                    quanLySach.sapXepTheoGia();
                    break;
                case 5:
                    System.out.print("Nhap ma sach: ");
                    String maSachXoa = scanner.nextLine();
                    quanLySach.xoaSach(maSachXoa);
                    break;
                case 6:
                    System.out.print("Nhap ma sach: ");
                    String maSachSua = scanner.nextLine();
                    System.out.print("Nhap gia moi: ");
                    double giaMoi = scanner.nextDouble();
                    quanLySach.suaGiaBia(maSachSua, giaMoi);
                    break;
                case 7:
                    quanLySach.tinhTongTriGia();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (luaChon != 0);

        scanner.close();
    }
}
