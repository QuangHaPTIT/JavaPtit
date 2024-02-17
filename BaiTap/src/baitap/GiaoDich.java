/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author ASUS
 */
public class GiaoDich {
    private String ma, ngay;
    private double donGia;
    private int soLuong;
    private static int sMa = 1;

    public GiaoDich() {
    }

    public GiaoDich(String ngay, double donGia, int soLuong) {
        this.ma = ma;
        this.ngay = ngay;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa() {
        this.ma = this.ma.format("%03d", sMa++);
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    
    public String toString(){
        return  getNgay() + " " + getSoLuong() + " " + String.format("%.1f", getDonGia());
    }
    
}
