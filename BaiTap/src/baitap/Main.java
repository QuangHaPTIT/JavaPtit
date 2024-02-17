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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NganHang nh = new NganHang();
        while(true){
            int n = sc.nextInt();
            switch(n){
                case 1:
                    GiaoDichVang x = new GiaoDichVang(sc.next(), sc.nextDouble(), sc.nextInt(), sc.next());
                    x.setMa();
                    nh.nhapGiaoDichV(x);
                    break;
                case 2:
                    GiaoDichTT y = new GiaoDichTT(sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble(), sc.next());
                    y.setMa();
                    nh.nhapGiaoDichTT(y);
                    break;
                case 3:
                    nh.out();
                    break;
                case 4:
                    
            }
               if(n == 10){
                   break;
               }     
        }
    }
}
