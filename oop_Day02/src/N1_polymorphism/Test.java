package N1_polymorphism;

public class Test {
    public static void main(String[] args) {
        //认识多态，：对象多态，行为多态
        //多态的前提：有继承/实现的关系，存在父类引用子类对象，存在方法重写
        //1、对象多态
        //创建对象一般都是如下形式
        //Teacher t = new Teacher();
        //当我们的类有了继承，就可以使用对象多态
        People p1 = new Student();
        //2、行为多态
        p1.run();//编译看左边，识别看右边
        System.out.println(p1.name);//编译看左边，识别看左边

        People p2 = new Teacher();
        //2、行为多态
        p2.run();//编译看左边，识别看右边
        System.out.println(p1.name);//编译看左边，识别看左边
    }
}
