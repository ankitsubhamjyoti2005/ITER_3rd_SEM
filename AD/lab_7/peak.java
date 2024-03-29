import java.io.*;
import java.util.*;
 
class peak {
    static int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length;
        while (i <= j) {
            int mid = (i + j) / 2;
            if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == n - 1 || arr[mid + 1] < arr[mid]))
                return mid;
            else if (mid > 0 && arr[mid - 1] > arr[mid])
                j = mid - 1;
            else
                i = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int A[] = { 1, 4, 45, 6, 10, -8 };

        int ans = peakIndexInMountainArray(A);
        System.out.println(ans);
    }
}