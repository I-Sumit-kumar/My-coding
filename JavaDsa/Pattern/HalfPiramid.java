package Pattern;
import java.util.*;

public class HalfPiramid {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("How much long you want to make a Halp piramid:- ");
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
