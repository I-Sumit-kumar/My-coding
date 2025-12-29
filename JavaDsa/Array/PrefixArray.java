package Array;

public class PrefixArray {
    public static void PrefixArray(int arr[]) {
        int Prefix[] = new int[arr.length];
        Prefix[0] = arr[0];
        for (int i = 1; i < Prefix.length; i++) {
            Prefix[i]=Prefix[i-1]+arr[i];
        }
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < Prefix.length; i++) {
            int start=i;
            int sum=0;
            for (int j = 1; j < Prefix.length; j++) {
                int end=j;
                sum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start-1];
                System.out.println(sum);
                if (maxsum<sum){
                    maxsum=sum;
                }
            }
            
        }
        System.out.println("MAX SUM IS:-  "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        PrefixArray(arr);
    }
}
