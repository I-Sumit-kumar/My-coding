package Array;

public class KadanAlgo {
    public static void KadanAlgo(int arr[]) {
        int Sum=0,Maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            Sum = Sum + arr[i];
            if (Sum<0) {
                Sum=0;
            }
            Maxsum = Math.max(Maxsum, Sum);
        }
        System.out.println(Maxsum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        KadanAlgo(arr);
    }
}
