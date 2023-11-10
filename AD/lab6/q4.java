import java.util.Arrays;

class q4 
{
  
  static int maxAbsDiff(int arr[], int n)
  {

    Arrays.sort(arr);
    return arr[n-1] - arr[0];
  }
  static int findMinDiff(int[] arr, int n)
    {
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < diff)
                    diff = Math.abs((arr[i] - arr[j]));
 
        return diff;
    }

  public static void main(String args[]) {
    int arr[] = {2,1,5,3};
    int n = arr.length;
    System.out.println(maxAbsDiff(arr, n)); 
    System.out.println(findMinDiff(arr, n)); 
  }
}
