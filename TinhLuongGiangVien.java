

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TinhLuongGiangVien {
    private static int mgv = 0;
    private String name;
    private double hsl;
    private String hskk;
    private int gioNgienCuu;
    private int k;
    public TinhLuongGiangVien(String name, double hsl, String hskk, int gioNgienCuu) {
        this.name = name;
        this.hsl = hsl;
        this.hskk = hskk;
        this.gioNgienCuu = gioNgienCuu;
        ++mgv;
    }
    public static int getMgv() {
        return mgv;
    }
    public void setMGV(){
        k = this.mgv;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHsl() {
        return hsl;
    }
    public void setHsl(double hsl) {
        this.hsl = hsl;
    }
    public String getHskk() {
        return hskk;
    }
    public void setHskk(String hskk) {
        this.hskk = hskk;
    }
    public double luongLinh(){
        double cnt;
        if(this.hskk.equals("A")){
            cnt =  1.5;
        }else if(hskk.equals("B")){
            cnt = 1.2;
        }else{
            cnt = 1;
        }
        if(gioNgienCuu <= 100){
            return hsl * cnt * 3000 * 0.85;
        }else if(gioNgienCuu <= 350){
            return hsl * cnt * 3000 * 0.9;
        }else if(gioNgienCuu <= 499){
            return hsl * cnt * 3000 * 0.95;
        }else{
            return hsl * cnt * 3000;
        }
    }
    public int getGioNgienCuu() {
        return gioNgienCuu;
    }
    public void setGioNgienCuu(int gioNgienCuu) {
        this.gioNgienCuu = gioNgienCuu;
    }
     
    public String toString(){
        return "PM" + String.format("%03d", k) + " " + name + " " + hsl + " " + hskk + " " + gioNgienCuu + " " + luongLinh();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
        List<TinhLuongGiangVien> list = new ArrayList<>();
        int t = sc.nextInt();
        while(t -- > 0){
            TinhLuongGiangVien x = new TinhLuongGiangVien(sc.nextLine(), sc.nextDouble(), sc.nextLine(), sc.nextInt());
            x.setMGV();
            list.add(x);
        }
        for(TinhLuongGiangVien x : list){
            System.out.println(x);
        }
        System.out.println("Heloo");
    }
}
