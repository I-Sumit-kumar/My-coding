package Array;

public class Pair {
    public static void Pair(int arr[]){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+ arr[i]+","+arr[j]+") ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+total);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Pair(arr);
    }
}
