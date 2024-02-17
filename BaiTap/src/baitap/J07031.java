/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ASUS
 */
public class J07031 {
    
public static boolean snt(int x){
        if(x < 2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static<T> List doc(String file){
        List<T> list = new ArrayList<>();
        try{
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
            list = (List<T>) o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    public static<T> void viet(String file, List<T> arr){
        try{
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(arr);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        
        List<Integer> list1 = doc("DATA1.in");
        List<Integer> list2 = doc("DATA2.in");
        Set<Integer> st = new TreeSet<>();
        for(Integer x : list1){
            if(snt(x)){
                st.add(x);
            }
        }

        for(int x : st){
            int j = 1000000 - x;
            if(x >= j){
                break;
            }

            if(!list2.contains(x) && !list2.contains(j) && list1.contains(x)){
                System.out.println(x + " " + (1000000 - x));
            }
        }
    }
}
