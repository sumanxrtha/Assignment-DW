package AnyMatrixMul;

import java.util.Scanner;

public class MatrixMul {
    private int rowc = 0;
    private int columnc = 0;

    public int getRowc() {
        return rowc;
    }

    public int getColumnc() {
        return columnc;
    }

    public void InputSize(String a) {
        //matrix size...
        System.out.println("how many rows in " + a + " matrix");
        Scanner aka = new Scanner(System.in);
        rowc = aka.nextInt();
        System.out.println("how many columns in " + a + " matrix");
        columnc = aka.nextInt();

    }

    public int Check(int fcol, int srow) {           //checking first column with second matrix row
        if (fcol == srow) {
            return 0;
        } else {
            System.out.println("dimention error");
            return 1;
        }
    }

    public int[][] InputData(int row, int column,int matnum) {
        int arr[][] = new int[row][column];
        Scanner aka = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("enter the value of matrix"+matnum+"["+i+"]["+j+"]");
                arr[i][j] = aka.nextInt();
            }
        }
        return arr;
    }

    public void Mathe(int[][] mat1,int[][] mat2) {


//        int[][] mat1 = {{1, 2, 3}, {1, 2, 3}};
//        int[][] mat2 = {{1, 4}, {3, 2}};
//
        int[][] total = new int[mat1.length][mat2[1].length];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[1].length; j++) {
                int k = 0;
//                if (i != j) {
//                    total[i][j] = mat1[i][i] * mat2[i][j] + mat1[i][j] * mat2[j][j];
//                } else {
//                    int k = j;
//                    if (k == 1) {
//                        k = 0;
//                    }
//                    total[i][j] = mat1[i][i] * mat2[i][i] + mat1[i][k + 1] * mat2[k + 1][i];
//                }
                for (k = 0; k < mat1[1].length; k++) {
//                    total[i][j] = mat1[i][k]*mat2[k][j]+mat1[i][k+1]*mat2[k+1][j];
                    total[i][j] = total[i][j] + mat1[i][k] * mat2[k][j];
                }

            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[1].length; j++) {
                System.out.print(total[i][j] + " ");
            }
            System.out.println();
        }

    }
}
