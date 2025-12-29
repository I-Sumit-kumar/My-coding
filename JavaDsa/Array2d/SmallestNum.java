package _2DArray;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        int mat[][] = new int[3][3];
        int row=mat.length,colo=mat[0].length;
        // Input data.
        System.out.println("Write your input");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<colo;i++){
            System.out.println("Row "+(i+1)+":-");
            for(int j=0;j<row;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        // out put data.
        System.out.println("Your input Matrix is ");
        for(int i=0;i<colo;i++){
            for(int j=0;j<row;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        // finding smallest number in matrix.
        int min = mat[0][0];
        for(int i=0;i<colo;i++){
            for(int j=0;j<row;j++){
                if(mat[i][j]<min)
                min = mat[i][j];
            }
        }
        System.out.println("Smallest number in matrix is "+min);
    }
}
