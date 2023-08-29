package N2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //多态的好处
        //1、可以实现解藕合，右边对象可以随时切换，以便后续的更改业务
        People p1 = new Student();//People p1 = new Teacher();
        //对象Student可以与Teacher切换，不影响实际输出
        p1.run();
        //p1.test();//多态存在问题：无法直接调用子类的独有功能

        //强制类型转换
        //Student s1 = (Student)p1;
        //s1.test();

        //强制类型转换存在的问题，编译阶段有继承或者实现关系就可以强制转换，但是运行时可能出现类型转换异常
        //Teacher t1 = (Teacher)p1;
        //t1.test();

        if(p1 instanceof Student){
            Student s2 = (Student)p1;
            s2.test();
        }else{
            Teacher t2 = (Teacher) p1;
            t2.test();
        }

        System.out.println("---------------------------------");

        //可以使用父类类型的变量作为形参，可以接受一切子类对象
        Student s = new Student();
        go(s);
        Teacher t = new Teacher();
        go(t);
    }

    public static void go(People p){
        p.run();

        if(p instanceof Student){
            Student s = (Student) p;
            s.test();
        }else if(p instanceof Teacher){
            Teacher t = (Teacher) p;
            t.test();
        }
    }
}
