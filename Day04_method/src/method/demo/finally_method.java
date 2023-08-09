package method.demo;

public class finally_method {

    public static void main(String[] args) {


        //最后的：方法还有一种就是重载，一个方法能用几次，但格式需要不一样

        test();

        System.out.println("--------------------------------");

        int a = 10;
        int b = 20;
        System.out.println(test(a,b));

        System.out.println("--------------------------------");

        String str = "我学会数数啦！";
        int[] i = {1,2,3,4,5};
        test(str,i);


    }

    public static void test(){

        for (int i = 0; i < 3; i++) {

            System.out.println("Hello World!");

        }

    }

    public static int test(int x,int y){

        int z = x + y;
        return z;

    }

    public static void test(String x,int[] y){

        for (int i = 0; i < y.length; i++) {

            System.out.println(x + y[i]);

        }

    }

}
