import java.util.Arrays;

public class max_and_min {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        int max = 0;
        int min = Integer.MIN_VALUE;
        //System.out.println(Arrays.stream(ar).max());
        for (int i = 0;i<ar.length;i++){
            if (ar[i]>max){
                max = ar[i];
            } else if (min<ar[i]) {
                min = ar[i];
            }
        }

        System.out.println(max + " and "+ min);
    }
}
