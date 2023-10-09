public class rotating_by_k {
//    static void Rotate(int arr[],int n, int k )
//    {
//        k=k%n;
//        for(int i = 1; i < n+1; i++)
//        {
//            if(i<k)
//            {
//                System.out.print(a[n + i - k] + " ");
//            }
//            else
//            {
//
//                System.out.print(a[i - k] + " ");
//            }
//        }
//
//    }

    public static void main(String[] args) {
        int k = 3;
        int arr[] = { 1, 2, 3, 4, 5 };
        int i, j;
        int n= arr.length;
//        Rotate(ar,ar.length,place);
        for (i = n - k , j = n -1 ; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the first n-k terms
        for (i = 0, j = n - k - 1 ; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // Reverse the entire array
        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int l = 0; l < arr.length;  l++) {
            System.out.print(arr[l] +" ");
        }
    }
}
