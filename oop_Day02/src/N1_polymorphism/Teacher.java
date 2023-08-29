package N1_polymorphism;

public class Teacher extends People{
    public String name = "Teacher";

    //当我们继承了父类，就可以调用父类的非私有方法，以及重写父类方法
    @Override
    public void run() {
        System.out.println("老师可以教知识");
    }
}
