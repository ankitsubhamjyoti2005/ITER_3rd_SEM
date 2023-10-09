import java.util.*;

//sum of na numbers
public class sum_n_num {

    static int sum(int arr[])
    {
        int sum = 0; // inital value will be 0
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        System.out.print("the sum is:-"+sum(ar));

    }
}
