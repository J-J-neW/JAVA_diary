package N4_staticAttention;

public class Student {

    //类变量
    private static String name;
    //实例变量
    private int age;

    //1、类方法中可以直接访问类的成员，不可以访问实例的成员
    //3、实例方法中可以出现this关键字，类方法中则不行
    public static void printHelloWord(){
        //同一个类中的方法与变量可以访问，也可以省略类名
        name = "Hello";//Student.name = "Hello";
        printHelloWord2();//Student.printPass();
        //printPass2();//报错！
        //System.out.println(this);//报错！
    }

    public static void printHelloWord2(){

    }

    //2、实例方法既可以直接访问类成员，也可以直接访问实例成员
    //3、实例方法中可以出现this关键字，类方法中则不行
    public void printPass(){
        //访问类方法和类变量是可以的
        name = "111";
        printHelloWord();

        //访问实例变量也是可以的
        age = 10;
        printPass2();

        //实例方法就是对象的方法，这个this调用的就是对象
        System.out.println(this);
    }

    public void printPass2(){

    }
}
