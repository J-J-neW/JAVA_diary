public class Dynamic_array01 {
    public static void main(String[] args) {


        //静态数组与动态数组的区别
        //当你知道需要多少个数据，知道每个数据是什么的时候采用静态数组
        //当你不知道数组的每个数据是什么的时候，动态数据就比较适合

        //每个类型的数组元素默认值都是不同的
        //byte,short,int,char,long类型的数组元素默认值都为0
        //float,double类型的数组默认元素值为0.0
        //boolean类型的数组默认元素值为false
        //String类型的数组默认元素值为null


        int[] num = new int[5];//数组有5个未知数
        System.out.println(num[0]);//0

        float[] num1 = new float[5];
        System.out.println(num1[0]);//0.0

        boolean[] num2 = new boolean[5];
        System.out.println(num2[0]);//false

        String[] num3 = new String[5];
        System.out.println(num3[0]);//null


    }
}
