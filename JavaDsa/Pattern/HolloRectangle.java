package Pattern;

public class HolloRectangle {
    public static void rectangle(int row ,int colo){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= colo; j++) {
                if (i==1||i==row||j==1||j==colo) {
                    System.out.print("* ");
                }
                else
                System.out.print("  ");
            }
            System.out.println();
    }
}
    public static void main(String[] args) {

        rectangle(5, 15);
    }
}
