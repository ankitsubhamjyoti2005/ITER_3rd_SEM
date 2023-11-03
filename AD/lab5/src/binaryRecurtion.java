public class binaryRecurtion {
    static int binarySearch(int arr[], int s, int e, int x) {
        if (e >= s) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == e) {
                return mid;
            }
            if (arr[mid] > e) {
                return binarySearch(arr, s, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, e, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int ans = binarySearch(arr, 0, arr.length - 1, 40);
        if (ans == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + ans);
    }
}