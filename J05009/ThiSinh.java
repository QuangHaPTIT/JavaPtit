package J05009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ThiSinh {
    private int msv;
    private static int cnt = 0;
    private String name;
    private String dateofBirth;
    private double m1, m2, m3;
    public ThiSinh(String name, String dateofBirth, double m1, double m2, double m3) {
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        ++cnt;
        
    }
    public int getMsv() {
        
        return msv;
    }
    public void setMsv(){
        msv = cnt;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateofBirth() {
        return dateofBirth;
    }
    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
    public double getM1() {
        return m1;
    }
    public void setM1(double m1) {
        this.m1 = m1;
    }
    public double getM2() {
        return m2;
    }
    public void setM2(double m2) {
        this.m2 = m2;
    }
    public double getM3() {
        return m3;
    }
    public void setM3(double m3) {
        this.m3 = m3;
    }
    public double getTongDiem(){
        return m1 + m2 + m3;
    }
    public String toString(){
        return getMsv() + " " + getName() + " " + getDateofBirth() + " " + getTongDiem();
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int t = sc.nextInt();
        List<ThiSinh> list = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            x.setMsv();
            list.add(x);
        }
        
        Collections.sort(list, new Comparator<ThiSinh>() {
            
        

            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o1.getTongDiem() != o2.getTongDiem()){
                    return o1.getTongDiem() > o2.getTongDiem() ? -1 : 1;
                }else{
                    return o1.getMsv() - o2.getMsv();
                }
            }
        });
        System.out.println(list.get(0));
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).getTongDiem() == list.get(0).getTongDiem()){
                System.out.println(list.get(i));
            }else{
                break;
            }
        }
    
}
}
