public class Question1 {
    public static void main(String[] args) {
        int[] nums = {3, -5, 7, -2, 0, -8};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) nums[i] = 0;
        }

        for (int num : nums) System.out.print(num + " ");
    }
}
