package Array;

public class SubArray {
    public static void SubArray(int arr[]){
        int total=0;
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+" ");
                    sum = sum + arr[j2];
                    total++;
                }
                System.out.print("   :->  Sum of sub array = "+sum);
                if (sum > Largest) {
                    Largest = sum; 
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of Subarray :-"+total);
        System.out.println("Largest Sum of the array is :-"+Largest);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6 };

        SubArray(arr);
    }
}
