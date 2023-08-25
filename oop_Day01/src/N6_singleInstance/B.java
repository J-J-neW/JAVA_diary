package N6_singleInstance;

public class B {
    //懒汉式单例

    //2、定义一个类变量，用于存储这个类的一个对象
    private static B b;

    //1、把类的构造器私有
    private B(){

    }

    //3、定义一个类的方法，这个方法要保证第一次调用是才创建对象，后面调用时都会返回这个对象
    public static B getIntance(){
        if(b == null){
            b = new B();
        }

        return b;
    }
}
