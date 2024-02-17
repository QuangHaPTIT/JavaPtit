package VaoRaFile;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
public class J07006 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] dd = new int[1000];
        for (Integer i : list) {
            dd[i]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (dd[i] > 0) {
                System.out.println(i + " " + dd[i]);
            }
        }
    }
}