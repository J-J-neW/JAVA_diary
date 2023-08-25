package N5_block;

public class Student {
    static int age = 80;
    static String name;

    //静态代码块，由于类只加载一次，所以静态代码块也只会加载一次
    static {
        System.out.println("111");
        //静态代码块里可以赋值
        name = "222";
    }

    //实例代码块,每次创建对象时，执行实例代码块，并在构造器之前执行
    {
        System.out.println("实例代码块");
    }

    public Student(){
        System.out.println("无参数构造器");
    }

    public Student(int a){
        System.out.println("有参数构造器");
    }

}
