class Solution {
    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
            
            if (nums[mid] == target) { 
                return mid; 
            } else if (nums[mid] < target) { 
                left = mid + 1; 
            } else { 
                right = mid - 1; 
            }
        }
        
        return -1; 
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int ans = search(arr,40);
        if (ans == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + ans);
    }
}
