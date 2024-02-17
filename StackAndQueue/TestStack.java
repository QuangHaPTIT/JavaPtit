package StackAndQueue;

import java.util.Stack;

/*
push(): thêm phần tử vào đầu stack
pop(): lấy ra và xóa phần tử ở đầu stack
peek(): lấy phần tử ở đầu 
empty(): kiểm tra stack có rỗng không
search(): tìm kiếm phần tử trong stack
*/

public class TestStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Pham Ha");
        st.push("YES");
        st.push("No");
        System.out.println("Phan Tu o Dau " + st.peek());
        st.pop();
        System.out.println("Phan Tu o Dau " + st.peek());
        st.pop();
        System.out.println(st.size());
    }
}
