package day2;

public class sunarray {
   
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int cur= nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(nums[i], cur+ nums[i]);
            max = Math.max(max, cur);
        }

        System.out.println("Maximum Sum: " + max);
    }
}

