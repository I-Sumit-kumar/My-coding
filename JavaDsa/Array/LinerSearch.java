package Array;

public class LinerSearch {
    public static int LinerSearch(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== key)
            return i;
        }
        return -1;
    }    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int key = 7;
        int ans = LinerSearch(arr, key);
        if (ans==-1)
        System.out.println("...NOT FOUND...");
        else
        System.out.println("The number is at index "+ans);
    }
}
