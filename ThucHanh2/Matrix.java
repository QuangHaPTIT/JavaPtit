package ThucHanh2;


import java.util.*;

import java.io.*;



public class Matrix {

    private int[][] a;

    private int n, m;



    public Matrix(int n, int m) {

        this.n = n;

        this.m = m;

        this.a = new int[n][m];

    }



    public void readMatrix(Scanner sc) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                a[i][j] = sc.nextInt();

            }

        }

    }



    public void sortColumn(int col) {

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (a[i][col] > a[j][col]) {

                    int temp = a[i][col];

                    a[i][col] = a[j][col];

                    a[j][col] = temp;

                }

            }

        }

    }



    public void printMatrix() {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(a[i][j] + " ");

            }

            System.out.println();

        }

    }



    public static void main(String[] args) throws FileNotFoundException {

        try{
            Scanner sc = new Scanner(new File("MATRIX.in"));

        int t = Integer.parseInt(sc.next());

        while (t-- > 0) {

            int n = Integer.parseInt(sc.next());

            int m = Integer.parseInt(sc.next());

            int i = Integer.parseInt(sc.next()) - 1;

            Matrix matrix = new Matrix(n, m);

            matrix.readMatrix(sc);

            matrix.sortColumn(i);

            matrix.printMatrix();

        }

        sc.close();

    

        }catch(Exception e){
            
        }
    }
}