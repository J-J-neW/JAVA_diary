package N8_interface;

public class Test {
    public static void main(String[] args) {
        //认识接口的好处
        //弥补了类单继承的不足，一个类同时可以实现多个接口
        //让程序可以面向接口编程，这样程序员就可以灵活方便的切换各种业务实现
        Driver d = new A();
        d.drive();

        Singer s = new A();
        s.sing();

        //当我们觉得A满足不了我们时，可以随时切换B
        //Driver d2 = new A();
        Driver d2 = new B();
        d2.drive();

    }
}

class B implements Driver{

    @Override
    public void drive() {

    }
}

//弥补了类单继承的不足，一个类同时可以实现多个接口
class A extends Student implements Driver,Singer{

    @Override
    public void drive() {

    }

    @Override
    public void sing() {

    }
}

class Student{

}

interface Driver{
    void drive();
}

interface Singer{
    void sing();
}