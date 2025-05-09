public class MaxProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty.");
        }

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(curr, curr * maxSoFar);
            minSoFar = Math.min(curr, curr * minSoFar);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }

    public static void main(String[] args) {
        try {
            int[] nums = {2, 3, -2, 4};
            System.out.println("Max Product: " + maxProduct(nums));

            int[] empty = {};
            System.out.println("Max Product: " + maxProduct(empty));

        } catch (IllegalArgumentException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
