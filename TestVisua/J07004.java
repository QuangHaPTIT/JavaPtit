package TestVisua;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        Map<Integer, Integer> mp = new TreeMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int x = Integer.parseInt(s);
                if(mp.containsKey(x)){
                    int tanSuat = mp.get(x);
                    mp.put(x, tanSuat + 1);
                }else{
                    mp.put(x, 1);
                }
            }catch(Exception e){

            }
        }
        Set<Map.Entry<Integer, Integer>> st = mp.entrySet();
        for(Map.Entry<Integer, Integer> entry : st){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
