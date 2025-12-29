package Array;

public class MaxSubarray {
    public static void MaxSubarray(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum=sum+arr[j];
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
            if (sum>max){
                max=sum;
            }
            System.out.println("Sum of the subarray is "+sum);
        }
        System.out.println("Largest sum of sub array is "+max);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        MaxSubarray(arr);
    }
}
