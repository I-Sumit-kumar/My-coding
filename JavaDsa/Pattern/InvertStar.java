package Pattern;
import java.util.*;

public class InvertStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much log you want to make a Inverted Star:- ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
