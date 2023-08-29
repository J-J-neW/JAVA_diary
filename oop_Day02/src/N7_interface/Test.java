package N7_interface;

public class Test {
    public static void main(String[] args) {
        //认识接口内容
        //1、成员变量（常量）2、成员方法（抽象方法）
        //接口中不能存在构造器以及代码块，接口不能创建对象--例A
        //接口是用来被类实现(implement)的，实现接口的类称为实现类--例B、C、D
        //一个类可以实现多个接口，实现类实现多个窗口，必须重写完全部接口的全部抽象方法，否则实现类需要定义成抽象类--例B、C、D

        System.out.println(A.SCHOOL_NAME);
        //A a = new A();无法创建对象

    }
}
