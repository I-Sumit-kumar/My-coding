package _2DArray;
import java.util.*; // Import the Scanner class

public class Matrices {
    public static boolean Search(int mat[][], int key){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j]==key) {
                    System.out.println("We found the element in posictin number\t("+(i+1)+","+(j+1)+")");
                    return true;
                }
            }
        }
        return false;
    }
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
        System.out.println("Enter the element you want to search");
        int key = sc.nextInt();
        Search(mat,key);
    }
}