package VaoRaFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Item{
    private String ma;
    private String ten, nhom;
    private Double giaMua, giaBan;
    private static int sma = 1;
    
    public Item() {
    }
    public Item( String ten, String nhom, Double giaMua, Double giaBan) {
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    public String getMa() {
        return ma;
    }
    public void setMa() {
        this.ma = "MH" + String.format("%02d", sma);
        sma++;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getNhom() {
        return nhom;
    }
    public void setNhom(String nhom) {
        this.nhom = nhom;
    }
    public Double getGiaMua() {
        return giaMua;
    }
    public void setGiaMua(Double giaMua) {
        this.giaMua = giaMua;
    }
    public Double getGiaBan() {
        return giaBan;
    }
    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }
    public static int getSma() {
        return sma;
    }
    public static void setSma(int sma) {
        Item.sma = sma;
    }
    public double loiNhuan(){
        return this.giaBan - this.giaMua;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f", this.giaBan - this.giaMua);
    }
    
}

public class J07050 {
    public static void main(String[] args) {
        try {
            File file = new File("MATHANG.in");
            Scanner sc = new Scanner(file);
            int t = Integer.parseInt(sc.nextLine());
            List<Item> list = new ArrayList<>();
            while(t-- > 0){
                
                    Item x = new Item(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
                    x.setMa();
                    list.add(x);
            }
            Collections.sort(list, new Comparator<Item>() {
                public int compare(Item o1, Item o2){
                    if(o1.loiNhuan() > o2.loiNhuan()){
                        return -1;
                    }else{
                        return 1;
                    }
                }
            });
            for(Item x : list){
                System.out.println(x);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}