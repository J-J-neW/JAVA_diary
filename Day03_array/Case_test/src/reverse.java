public class reverse {
    public static void main(String[] args) {

        //求反转值

        double[] nums = {10, 20, 30, 40, 50};

        for (int i = 0,j = nums.length - 1 ; i < j; i++,j--) {

            double temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
