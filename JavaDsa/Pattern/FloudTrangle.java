package Pattern;

public class FloudTrangle {
    public static void FloudTrangle(int n){
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void p01Triangle(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (((i+j)%2)==0) {
                    System.out.print("1 ");
                }
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FloudTrangle(6);
        p01Triangle(6);
    }
}
