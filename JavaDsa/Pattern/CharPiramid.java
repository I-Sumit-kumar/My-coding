package Pattern;
import java.util.*;

public class CharPiramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        System.out.print("How much long you want to make a Charecter Piramid:- ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + "\t");
                ch++;
            }
            System.out.println();
        }
    }
}
