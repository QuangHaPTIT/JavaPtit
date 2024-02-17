package StackAndQueue;

import java.util.ArrayDeque;

/*
addFirst(): thêm vào đầu
addLast(): thêm vào cuối
peekFirst(): lấy ở đầu
peekLast(): lấy ở cuối
removeFirst(): lấy và xóa phần tử ở đầu
removeLast(): lấy và xóa phần tử ở cuối
 */

public class TestArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<String> aqe = new ArrayDeque<>();
        aqe.add("Quang");
        aqe.add("Nam");
        aqe.add("Dung");
        aqe.addFirst("Hung");
        System.out.println(aqe.peekLast());
    }
}
