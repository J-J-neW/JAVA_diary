import java.nio.CharBuffer;
import java.util.Scanner;

public class Dynamic_array_test01 {
    public static void main(String[] args) {


        //案例
        //学校开展了校园十大歌手的比赛，现需要把决赛的五个同学的分数统计下来，并求出平均分


        double[] score = new double[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {

            System.out.println("请输入第" + (i+1) + "个同学的分数：");
            double num = sc.nextDouble();

            score[i] = num;

        }


        double sum = 0;
        for (int i = 0; i < score.length; i++) {

            sum += score[i];
        }

        System.out.println("最终的平均分为：" + sum / score.length);
    }
}
