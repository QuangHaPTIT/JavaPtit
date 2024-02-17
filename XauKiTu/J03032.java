package XauKiTu;

import java.util.Scanner;

public class J03032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            String[] ar = sc.nextLine().trim().split("\\s+");
            for (String i : ar) {
                i = new StringBuilder(i).reverse().toString();
                System.out.print(i + " ");
            }
            
            System.out.println();
        }
    }
}