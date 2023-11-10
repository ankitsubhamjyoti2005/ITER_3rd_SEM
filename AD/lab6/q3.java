
import java.lang.*;

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int A[] = { 0, 10, 2, -10, -20 };
        Arrays.sort(A);
        for (int l = 0; l < A.length-1;  l++) {
           if(A[l]>=0)
           {
               if(A[l+1]>(A[l]+1))
               {
                   System.out.println("the number is:- "+ A[l]+1);
                   System.exit(0);
               }
           }
        }

    }
}
