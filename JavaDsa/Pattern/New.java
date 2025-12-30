/* 
    1   7   12  16  19  21
    2   8   13  17  20
3   9   14  18
4   10  15
5   11
6
*/

package Pattern;
public class New {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 0; j <= (n/3)-i; j++) {
                if (j==0){
                System.out.print("\t");}
            }
            for (int j = 0; j <= (n - i); j++) {
                System.out.print(num + "\t");
                num = num + (n - j);
            }
            System.out.println();
        }
    }
}
    
