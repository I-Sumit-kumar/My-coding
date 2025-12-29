package _2DArray;

public class StairCaseSearch {
    public static boolean SpiralMatrix(int matrix[][], int key) {
        // // top key.
        // int row =0;
        // int col=matrix[0].length-1;
        // while (row<matrix.length && col>=0){
        //     if(matrix[row][col]==key){
        //         System.out.println("found the key at ("+(row+1)+","+(col+1)+")");
        //         return true;
        //     }
        //     if (key<matrix[row][col]) {
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // System.out.println("Key not found!!");
        // return false;
        // bottom key.
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("found the key at (" + (row + 1) + "," + (col + 1) + ")");
                return true;
            }
            if (key > matrix[row][col]) {
                col++;
            }
            else {
                row--;
            }
        }
        System.out.println("Key not found!!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        SpiralMatrix(matrix, 10);
    }
}
