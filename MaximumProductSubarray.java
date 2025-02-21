public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        // Initialize the result and the current max and min products.
        int result = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        
        // Iterate through the array, starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
            // When the number is negative, swap the current max and min
            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            
            // Update current maximum and minimum products
            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);
            
            // Update result if current maximum product is larger
            result = Math.max(result, currMax);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray (Example 1): " + maxProduct(nums1)); // Expected output: 6

        int[] nums2 = {-2, 0, -1};
        System.out.println("Maximum Product Subarray (Example 2): " + maxProduct(nums2)); // Expected output: 0
    }
}
