public class array_reductiion {
    static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    static int count(int arr[], int n)
    {
        sort(arr);
        boolean i = true;
        int a = 0;
        while(i){
            if (arr[a]>=0){
                i = false;
            }else{
                a++;
            }
        }
//        System.out.println(a);
        return (n - a);
    }
    static int Distinct(int arr[], int n)
    {
        
        int res = 1;
 
        // Pick all elements one by one
        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
 
            // If not printed earlier,
            // then print it
            if (i == j)
                res++;
        
        
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13 ,4,34,-5 };
        
        int c =count(arr,arr.length);
        int a[]=new int[arr.length-c];
        int t=0;
        for(int i = 0;i<arr.length;i++){
            if (i>=c){
                a[t++]=arr[i];
                
            }
        }
        int nc = Distinct(a, a.length);
        System.out.println(nc);


    }
}
