package N2_polymorphism;

public class Student extends People {
    public String name = "Student";

    //当我们继承了父类，就可以调用父类的非私有方法，以及重写父类方法
    @Override
    public void run() {
        System.out.println("学生跑的快");
    }

    public void test(){
        System.out.println("学生需要考试");
    }
}
