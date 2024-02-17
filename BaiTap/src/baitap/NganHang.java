/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NganHang implements ChucNang{
    private List<GiaoDich> list = new ArrayList<>();
    @Override
    public void nhapGiaoDichV(GiaoDichVang x) {
         list.add(x);
    }

    @Override
    public void nhapGiaoDichTT(GiaoDichTT x) {
        list.add(x);
    }

    @Override
    public void out() {
        for(GiaoDich x : list){
            System.out.println(x);
        }
    }

    @Override
    public void sua(String ma, Scanner in) {
         
    }

    @Override
    public void xoa(String ma) {
        int t = 0;
        for(int i = 0; i < list.size(); i++){
            if(ma.compareToIgnoreCase(list.get(i).getMa()) == 0){
                t = 1;
                System.out.println(list.remove(i));
                break;
            }
        }
        if(t == 0){
            System.out.println("Không Tìm Thấy Phần Tử Cần Xóa");
        }
    }

    @Override
    public void tongSoLuongGiaoDich(String tuNam, String denNam) {
        int cnt = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getNgay().compareTo(tuNam) >= 0 && list.get(i).getNgay().compareTo(denNam) <= 0){
                ++cnt;
            }
        }
        System.out.println(cnt);
    }

    @Override
    public void hienThiTheoNgay() {
        Collections.sort(list, new Comparator<GiaoDich>(){
        public int compare(GiaoDich o1, GiaoDich o2){
            return o1.getNgay().compareTo(o2.getNgay());
        }
    });
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    @Override
    public void hienThiChuaNgay(String date) {
        int t = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getNgay().equals(date)){
                System.out.println(list.get(i));
                t = 1;
            }
        }
        if(t == 0){
            System.out.println("Không Tìm Thấy Giao Dịch Vào Ngày " + date);
        }
    }

    @Override
    public void hienThiGiaoDichTuNamDenNam(String start_date, String end_date) {
        
    }
    
}
