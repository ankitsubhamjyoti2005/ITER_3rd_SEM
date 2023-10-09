import java.util.Arrays;

public class max_min_arr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        int q = 0;
        int a[] = new int[arr.length];
        if(arr.length%2==0){
        for (int i = 0;i<arr.length/2 ;i++ ){

            a[q] = arr[r];
            a[q+1] = arr[l];
            q=q+2;
            l++;
            r--;
        }}else{
            int mid = arr[arr.length/2];
            for (int i = 0;i<arr.length/2;i++ ) {

                a[q] = arr[r];
                a[q + 1] = arr[l];
                q = q + 2;
                l++;
                r--;
            }
            a[arr.length-1]=mid;
        }
        for (int w = 0; w< a.length;  w++) {
            System.out.print(a[w] +" ");
        }
    }
}
