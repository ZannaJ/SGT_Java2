package lesson4;

public class MaxNumber {

    public static void main(String[] args) {
        int[] nums = {2,3,4,5};

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {


            if (max < nums[i]) {
                max = nums[i];
            }
        }
        for (int j = 0; j < nums.length; j++) {



            if (max2 < nums[j] && nums[j] != max) {
                max2 = nums[j];
            }
        }

        for (int n = 0; n < nums.length; n++) {


            if (max3 < nums[n] && nums[n] != max && nums[n] != max2) {
                max3 = nums[n];
            }
        }

        if (nums.length < 3 && nums.length > 1) {
            System.out.println("The largest number is " + max);
        } else if (nums.length > 3 && nums.length < 1) {
            System.out.println("The third distinct maximum is " + max3);
        } else {

            System.out.println("The third distinct maximum is " + max3);
        }
    }
}