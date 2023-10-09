// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//class Kadane {
//    // Driver Code
//    public static void main(String[] args)
//    {
//        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
//        System.out.println("Maximum contiguous sum is "
//                + maxSubArraySum(a));
//    }
//
//    // Function Call
//    static int maxSubArraySum(int a[])
//    {
//        int size = a.length;
//        int max_so_far = Integer.MIN_VALUE, max_ending_here
//                = 0;
//
//        for (int i = 0; i < size; i++) {
//            max_ending_here = max_ending_here + a[i];
//            if (max_so_far < max_ending_here)
//                max_so_far = max_ending_here;
//            if (max_ending_here < 0)
//                max_ending_here = 0;
//        }
//        return max_so_far;
//    }
//}



//        int n = A.length;
//
//        int N = 1000010;
//
//        boolean[] present = new boolean[N];
//
//        int maxele = Integer.MIN_VALUE;
//
//        // Mark the occurrences
//        for (int i = 0; i < n; i++) {
//
//            if (A[i] > 0 && A[i] <= n)
//                present[A[i]] = true;
//
//            maxele = Math.max(maxele, A[i]);
//        }
//
//        for (int i = 1; i < N; i++) {
//            if (!present[i]) {
//                maxele + 1
//            }
//        }