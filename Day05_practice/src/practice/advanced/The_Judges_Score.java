package practice.advanced;

import java.util.Random;

public class The_Judges_Score {

    //对于最值之间的计算

    public static void main(String[] args) {

        System.out.println(createScore(5));

    }

    public static double createScore(int n){
        //n代表队数评委人数

        Random r = new Random();
        //随机代码
        double[] score = new double[n];
        for (int i = 0; i < n; i++) {

            score[i] = r.nextInt(101);
            //System.out.println(score[i]);//测试
        }

        double sum = score[0];
        double max = score[0];
        double min = score[0];
        for (int i = 1; i < score.length; i++) {

            sum += score[i];
            //计算总分

            if(max < score[i]){
                // 计算最大值
                max = score[i];
            }


            if(min > score[i]){
                // 计算最小值
                min = score[i];
            }


        }

        double sum1 = sum - max - min;
        //总分减最大值和最小值
        return sum1 / n;
        //平均分

        //System.out.println(sum);//测试
        //System.out.println(max);//测试
        //System.out.println(min);//测试

    }

}
