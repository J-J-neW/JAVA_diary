package N7_interface;

public interface A {
    //1、成员变量（常量）
    String SCHOOL_NAME = "Hello";

    //2、成员方法（抽象方法）
    void test();

    //接口中不能存在构造器以及代码块，接口不能创建对象
    //public A(){}
    //static {}
}
