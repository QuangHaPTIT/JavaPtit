package TestVisua;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        long sum = 0;
        while(sc.hasNext()){
            String s = sc.next();
        
                try{
                    sum += Integer.parseInt(s);
                }catch(NumberFormatException e){

                }
            
        }
        System.out.println(sum);
    }
}
