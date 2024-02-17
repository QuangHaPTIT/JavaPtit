/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class GiaoDichVang extends GiaoDich implements IGiaoDich{
    private String loaiVang;

    public GiaoDichVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang( String ngay, double donGia, int soLuong, String loaiVang) {
        super( ngay, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    
    
    
    @Override
    public double thanhTien() {
        return getSoLuong() * getDonGia();
    }
    public String toString(){
        return "V-" + super.getMa() + " " + super.toString() + " " +  getLoaiVang() + " " + String.format("%.1f", thanhTien());
    }
}
