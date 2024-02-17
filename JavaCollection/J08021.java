package JavaCollection;
import java.util.*;

public class J08021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Stack<Pair<Character, Integer>> st = new Stack<>();
            int ans = 0, n = s.length();
            int[] f = new int[n];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == ')' && st.empty() == false && st.peek().first() == '(') {
                    f[i] = f[i - 1];
                    if (st.peek().second() != 0) {
                        f[i] += f[st.peek().second() - 1];
                    }
                    f[i] += 2;
                    st.pop();
                } else {
                    st.push(new Pair(s.charAt(i), i));
                }
                if(ans < f[i]) ans = f[i];
            }
            System.out.println(ans);
        }

    }

}



 class Pair<T1, T2> {

    private T1 t1;
    private T2 t2;

    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 first() {
        return t1;
    }

    public T2 second() {
        return t2;
    }

}