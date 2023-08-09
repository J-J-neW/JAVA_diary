package method.demo;

public class advanced01_method {
    public static void main(String[] args) {

        //进阶的方法

        //方法的返回形式要么有类型(int,double....)，要么就是无返回类型void
        //有返回类型的用return返回，无返回类型的则不需要return,return也可用于断句


        //打印三行helloworld不需要返回值
        printHelloWorld();

        System.out.println("----------------------------------");

        int a = 10;
        int b = 2;
        int c = multiply(a,b);
        System.out.println(c);

    }

    public static void printHelloWorld(){

        for (int i = 0; i < 3; i++) {


            System.out.println("HelloWorld!");

        }


    }

    //------------------------------------------------------------

    public static int multiply(int x,int y){

        int z = x * y;
        return z;//如歌你在需要返回值的方法没有打return也会报错
    }

}
