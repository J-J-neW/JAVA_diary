package method.demo;

public class familiar_method {

    //------------------------------
    public static int add(int x,int y){

        int z = x + y;
        return z;
    }

    //不冲突，但只能存在一个
    //---------------------------------

    public static void main(String[] args) {


        //方法初体验与熟悉
        int a = 10;
        int b = 20;

        //int sum = add(a,b);
        //System.out.println(sum);//30

        System.out.println(add(a,b));//这种形式的输出方式也是可以的,都是30


    }

    //a 与 b 之间的加法
    //这个方法的前后顺序不规定，可以放在main后面，也可以放在前面
    /*
    public static int add(int x,int y){

        int z = x + y;
        return z;
    }
    */


}
