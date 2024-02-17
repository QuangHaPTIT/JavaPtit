package TestVisua;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class WordSet{
    private String file1;
    private Set<String> hs;
    
    WordSet(String file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        file1 = file;
        hs = new TreeSet<>();
        while(sc.hasNext()){
            hs.add(sc.next().toLowerCase());
        }
    }
    public String toString(){
        String result = "";
        for(String i : hs){
            result += i + "\n";
        }
        return result;
    }
}
public class J07007 {
    
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
