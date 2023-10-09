public class max_min_arr {
    static int getMaximum(int[] numbers, int size){
        //last element in an array, return element
        if(size == 1)
            return numbers[0];
        return Math.max(numbers[size -1], getMaximum(numbers, size -1));
    }

    static int getMinimum(int[] numbers, int size) {
        //last element in an array, return element
        if(size == 1)
            return numbers[0];
        return Math.min(numbers[size-1], getMinimum(numbers, size - 1));
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,0};
        System.out.println("the max ele:- "+getMaximum(arr, arr.length));
        System.out.println("the min ele:- "+getMinimum(arr, arr.length));
    }


}
