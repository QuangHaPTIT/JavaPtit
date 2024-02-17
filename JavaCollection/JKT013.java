package JavaCollection;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
        Stack<String> st = new Stack<>();
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.addFirst("8");
        adq.addFirst("6");
        while(true){
            if(!adq.isEmpty()){
                String tmp = adq.peekFirst();
                adq.removeFirst();
                adq.addLast(tmp + "6");
                adq.addLast(tmp + "8");
                if(!st.isEmpty() && st.peek().length() > n) break;
                st.push(tmp);
            }
        }
        if(!st.isEmpty()){
            st.pop();
        }
        System.out.println(st.size());
        while(!st.isEmpty()){
            System.out.print(st.peek() + " ");
            st.pop();
        }
        System.out.println();
        }
    }
}
