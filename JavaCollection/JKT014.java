import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class JKT014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ls[] = new int[n + 1];
            for(int i = 1; i <= n; i++){
               ls[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            int[] a= new int[n + 1];
            st.push(0);
            for(int i = 1; i <= n; i++){
                while(!st.isEmpty() &&  ls[st.peek()] <= ls[i]){
                    st.pop();
                }
                
                a[i] = i - st.peek();
                
                st.push(i);
            }
            for(int i = 1; i <= n; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
