package N7_extends;

//子类
public class Z extends F {
    //子类可以继承父类非私有的成员
    public void print(){
        System.out.println(name);
        printHello();

        //因为无法继承私有成员所以报错了！
        //System.out.println(age);
        //printHello2();
    }
}
