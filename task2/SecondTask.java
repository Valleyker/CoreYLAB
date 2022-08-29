package task2;

import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int[] arr = {5,6,3,2,5,1,4,9};
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

        testOfTheSort(arr);
    }
    private static void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(arr, l, r, mid, n - mid);
    }
    private static void merge(
            int[] arr, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }

    private static void testOfTheSort(int[] arr) {
        for (int i = arr.length - 2; i >= 0 ; i--) {
            assert arr[i+1] >= arr[i] : "Array is sorted incorrectly\n";
        }
        System.out.println("The array is sorted correctly");
    }
}
