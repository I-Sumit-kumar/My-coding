package Array;
import java.util.*;

public class Reverse {
    public static void Reverse(int arr[]){
        int last = arr.length-1;
        int first = 0;
        while (first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            last--;
            first++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
    }
}
