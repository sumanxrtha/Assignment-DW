package ArrayAddition;

import java.util.Arrays;

public class ArrayAddition {
    public void ArrayMethod(){
        int array[] = new int[5];
        Arrays.fill(array, 0, 5, -50);//fills array with value -50 from 0-5

        int[] array1 = new int[20];
        Arrays.setAll(array1, p -> p > 16 ? 5 : p);   //upto 0 - 16 and remaining 5
        for(int i=0 ; i<20; i++)
            System.out.println(array1[i]);
    }

    public void MatAdd(){
        int[][] mat1 = {{1,2},{3,4}};
        int[][] mat2 = {{9,3},{7,6}};
        int[][] total = new int[mat1.length][mat2[1].length];
        if(mat1[1].length == mat2.length) {
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat2[1].length; j++) {
                    total[i][j]= mat1[i][j]+ mat2[i][j];
                }
            }
        }
        else{
            System.out.println("dimension error");
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[1].length; j++) {
                System.out.print(total[i][j] +" ");
            }
            System.out.println();
        }

    }



}
