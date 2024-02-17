/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public interface ChucNang {
    public void nhapGiaoDichV(GiaoDichVang a);
    public void nhapGiaoDichTT(GiaoDichTT b);
    public void out();
    public void sua(String ma, Scanner in);
    public void xoa(String ma);
    public void tongSoLuongGiaoDich(String tuNam, String denNam);
    public void hienThiTheoNgay();
    public void hienThiChuaNgay(String date);
    public void hienThiGiaoDichTuNamDenNam(String start_date, String end_date);
}
