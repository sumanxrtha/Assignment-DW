package AnyMatrixMul;
public class OutputMul {
    public static void main(String[] args) {

        MatrixMul mul = new MatrixMul();

        mul.InputSize("1");
        int row1=mul.getRowc();
        int column1= mul.getColumnc();

        mul.InputSize("2");
        int row2= mul.getRowc();
        int column2 = mul.getColumnc();

        if (mul.Check(column1,row2)==1){
            System.out.println("sorry cant multiply");
        }
        else{
            int[][] mat1 = mul.InputData(row1,column1,1);
            int[][] mat2 = mul.InputData(row2,column2,2);

            mul.Mathe(mat1, mat2);
        }

    }
}
