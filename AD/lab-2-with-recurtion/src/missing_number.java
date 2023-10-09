public class missing_number {
        static int FirstMissing(int array[], int start, int end)
        {
            if (start > end)
                return end + 1;

            if (start != array[start])
                return start;

            int mid = (start + end) / 2;


            if (array[mid] == mid)
                return FirstMissing(array, mid+1, end);
            return FirstMissing(array, start, mid);
        }

        public static void main(String[] args)
        {

            int arr[] = { 1, 2, -3, 4, -5, 6, 10};
            int n = arr.length;
            System.out.println("First Missing element is : " + FirstMissing(arr, 0, n - 1));
        }

}
//approch 2