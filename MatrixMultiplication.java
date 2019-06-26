public class MatrixMultiplication {
    int[][] merge(int AB1[][], int AB2[][], int C[][], int n, int row, int col){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                C[i+row][j+col] = AB1[i][j] + AB2[i][j];
            }
        }
        return C;
    }
    int[][] MatrixMultiplication(int A[][], int B[][], int n, int row1, int col1, int row2, int col2){
        int C[][] = new int[n][n];
        int[][] AB1;
        int[][] AB2;
        if (n == 1){
            C[0][0] = A[row1][col1]*B[row2][col2];
        }else {
            int mid = n/2;
            //upperLeft
            AB1 = MatrixMultiplication(A, B, mid, row1, col1, row2, col2);
            AB2 = MatrixMultiplication(A, B, mid, row1, col1+mid, row2+mid, col2);
            merge(AB1, AB2, C, mid, 0, 0);
            //upperRight
            AB1 = MatrixMultiplication(A, B, mid, row1, col1, row2, col2+mid);
            AB2 = MatrixMultiplication(A, B, mid, row1, col1+mid, row2+mid, col2+mid);
            merge(AB1, AB2, C, mid, 0, mid);
            //lowerLeft
            AB1 = MatrixMultiplication(A, B, mid, row1+mid, col1, row2, col2);
            AB2 = MatrixMultiplication(A, B, mid, row1+mid, col1+mid, row2+mid, col2);
            merge(AB1, AB2, C, mid, mid, 0);
            //lowerRight
            AB1 = MatrixMultiplication(A, B, mid, row1+mid, col1, row2, col2+mid);
            AB2 = MatrixMultiplication(A, B, mid, row1+mid, col1+mid, row2+mid, col2+mid);
            merge(AB1, AB2, C, mid, mid, mid);
        }
        return C;
    }
}
