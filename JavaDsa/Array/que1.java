package Array;

public class que1 {

    public static int BinarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int num = 3;
        int result = BinarySearch(arr, num);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }

        int arr1[] = new int[arr.length];
        int j = 0;
        for (int i = num - 1; i < arr.length; i++) {
            arr1[j] = arr[i];
            j++;
        }
        for (int i = 0; i < num - 1; i++) {
            arr1[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}