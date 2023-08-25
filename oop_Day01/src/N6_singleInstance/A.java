package N6_singleInstance;

public class A {
    //单例设计模式(饿汉式单例)，确保一个类只有一个对象
    //做完就可以形成一个单例设计模式

    //2、定义一个类变量记住类的一个对象
    private static A a = new A();

    //1、把类的构造器私有
    private A(){

    }

    //3、定义一个类方法，返回一个对象
    private static A getObject(){
        return a;
    }
}
