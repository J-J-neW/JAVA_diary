package Random_practice;

import java.util.Random;
import java.util.Scanner;

public class guess_the_number {
    public static void main(String[] args) {


        Random r = new Random();
        int number = r.nextInt(100) + 1;//1-100之间的随机数

        //System.out.println(number);

        Scanner sc = new Scanner(System.in);

        System.out.println("开始猜数字游戏！");
        System.out.println();
        System.out.println("请输入你觉得的数字：");

        while(true)
        {

            int guess_number = sc.nextInt();

            if (guess_number > number)
            {
                System.out.println("数字偏大，加油");
            }
            else if(guess_number < number)
            {
                System.out.println("数字偏小，加油");
            }
            else
            {
                System.out.println();
                System.out.println("恭喜你，回答正确！");
                break;
            }

        }


    }
}
