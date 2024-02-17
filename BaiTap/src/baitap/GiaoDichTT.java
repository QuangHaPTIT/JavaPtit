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
public class GiaoDichTT extends GiaoDich implements IGiaoDich{
    private double tiGia;
    private String loaiTien;
    
    
    public GiaoDichTT() {
    }

    public GiaoDichTT(double tiGia, String loaiTien) {
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public GiaoDichTT( String ngay ,double donGia, int soLuong,  double tiGia ,String loaiTien ) {
        super(ngay, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTien() {
        return loaiTien.toUpperCase();
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }
    
    
    
    @Override
    public double thanhTien() {
        if(getLoaiTien().equals("VND")){
            return getSoLuong() * getDonGia();
        }else{
            return getSoLuong() * getDonGia() * getTiGia();
        }
        
    }
    
    
    public String toString(){
        
        return "TT-" + super.getMa() + " " + super.toString() + " " + getLoaiTien() + " " + String.format("%.1f", getTiGia()) + " " + String.format("%.1f", thanhTien());
         
    }
    
    
}
