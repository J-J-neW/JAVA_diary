public class array_test01 {
    public static void main(String[] args) {

        //实践案例
        //某班级成绩出来了，需要我们计算出这个班级最后的分数的总分
        //他们的分数分别为： 99，86，92，77，100


        double[] score = {99,86,92,77,100};

        double full = 0;

        for (int i = 0; i < score.length; i++) {

            full += score[i];
        }

        System.out.println("最终的总分为：" + full);
    }
}
