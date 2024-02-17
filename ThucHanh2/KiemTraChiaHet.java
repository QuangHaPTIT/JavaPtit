package ThucHanh2;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class KiemTraChiaHet {
    public static void main(String[] args) {
        File file = new File("SONGUYEN.IN");
        try{
            Scanner sc = new Scanner(file);
            int t = Integer.parseInt(sc.next());
            
                while(sc.hasNext()){
                BigInteger n = sc.nextBigInteger();
                 BigInteger a = BigInteger.valueOf(7);
                 BigInteger b = BigInteger.valueOf(13);
                 boolean isDivia = n.remainder(a).equals(BigInteger.ZERO);
                    boolean isDivib = n.remainder(b).equals(BigInteger.ZERO);
                if(isDivia && isDivib){
                    System.out.println("Both");
                }else if(isDivia){
                    System.out.println("Div 7");
                }else if(isDivib){
                    System.out.println("Div 13");
                }else{
                    System.out.println("None");
                }
            }
            
            
        }catch(Exception e){

        }
    }
}
