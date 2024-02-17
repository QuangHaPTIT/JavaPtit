package J08015;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CapSoCoTongBangK {
    public int UpperBound1(int l, int r, long x, long a[]){
        
        int m = 0;
        while(l <= r){
            m =( l + r )/ 2;
            if(x > a[m]){
                r = m - 1;
            }else{
                l = m + 1;
            }
            
        }
        return m;
    }    
    public int UpperBound2(int l, int r, long x, long a[]){
        int m = 0;
        while(l <= r){
            m =( l + r )/ 2;
            if(x <= a[m]){
                r = m - 1;
            }else{
                l = m + 1;
            }
            
        }
        return m;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            List<Long> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add(sc.nextLong());
            }
            Collections.sort(list);
            
     

    
        }
    }
}
