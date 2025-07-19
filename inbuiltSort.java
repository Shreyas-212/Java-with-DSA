import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray1(Integer arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int arr1[] = {5, 4, 1, 3, 2};
        Integer arr2[] = {5, 4, 1, 3, 2};
        Integer arr3[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr);
        printArray(arr);
        Arrays.sort(arr1, 0, 3);
        printArray(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
        printArray1(arr2);
        Arrays.sort(arr2, 0, 3, Collections.reverseOrder());
        printArray1(arr3);
    }
}
