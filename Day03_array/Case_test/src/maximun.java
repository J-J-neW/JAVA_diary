import java.util.Scanner;

public class maximun {
    public static void main(String[] args) {

        //案例
        //求最大值

        double[] nums = new double[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {

            System.out.println("请输入第" + (i+1) + "个数值，以求出最大值：");

            double num = sc.nextDouble();
            nums[i] = num;

        }

        double max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(max < nums[i])
            {
                max = nums[i];
            }

        }

        System.out.println("最大值为：" + max);
    }
}
