import java.util.*;
public class sum {

    static boolean
    hasArrayTwoCandidates(int A[], int arr_size, int sum)
    {
        int l, r;

        Arrays.sort(A);

        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (A[l] + A[r] == sum)
                return true;
            else if (A[l] + A[r] < sum)
                l++;
            else
                r--;
        }
        return false;
    }


    public static void main(String args[])
    {
        int A[] = { 1, 4, 4, 6, 0, -8 };
        int n = 16;
        int arr_size = A.length;


        if (hasArrayTwoCandidates(A, arr_size, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
