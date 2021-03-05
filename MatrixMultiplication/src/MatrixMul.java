public class MatrixMul {
    public void Mathe() {
        int[][] mat1 = {{1, 2}, {1, 2}};
        int[][] mat2 = {{1, 4}, {3, 2}};

        int[][] total = new int[2][2];

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                if(i!=j){
                    total[i][j]= mat1[i][i] * mat2[i][j] +mat1[i][j]*mat2[j][j];
                }
                else{
                    int k= j;
                    if(k==1){
                        k=0;
                    }
                    total[i][j]= mat1[i][i]*mat2[i][i] +mat1[i][k+1]*mat2[k+1][i];
                }
            }
        }
        for(int i=0; i<2;i++){
            for(int j=0; j<2; j++){
                System.out.print(total[i][j]+" ");
            }
            System.out.println();
        }
    }
}
