package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
add(): Thêm phần tử vào cuối queue
remove(): xóa bỏ phần tử ở đầu queue
peek(): lấy phần tử đầu queue nhưng không xóa 
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> qe = new ArrayDeque<>();
        qe.add("Quang Ha");
        qe.add("Hung");
        qe.add("Dung");
        qe.add("Nam");
        System.out.println(qe.peek());
    }
}
