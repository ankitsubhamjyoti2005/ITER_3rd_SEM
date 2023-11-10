import java.util.Arrays;

class q4 
{
  
  static int maxAbsDiff(int arr[], int n)
  {
    Arrays.sort(arr);
    System.out.println("min dif arr pair "+arr[n-1]+" "+arr[0]);
    return arr[n-1] - arr[0];
    
  }
 
  static int findMinDiff(int[] arr, int n)
    {
      int max_m = 0;
      int max_min = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < diff){
                    diff = Math.abs((arr[i] - arr[j]));
                    max_m=arr[i];
                    max_min = arr[j];
                }


        System.out.println("max dif arr pair "+max_m+" "+max_min);
        return diff;
    }

  public static void main(String args[]) {
    int arr[] = {2,1,5,3};
    int n = arr.length;
    int a = maxAbsDiff(arr, n);
    int b = findMinDiff(arr, n);
    System.out.println(a); 
    System.out.println(b); 
  }
}
