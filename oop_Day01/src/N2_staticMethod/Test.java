package N2_staticMethod;

public class Test {
    public static void main(String[] args) {
        //1、有无static修饰方法
        //类名.类方法
        Student.stu();
        //对象.类方法，一样可以正常使用但不推荐
        //Student s1 = new Student();
        //s1.stu();

        //2、实例方法的用法
        //对象.实例方法
        Student s2 = new Student();
        s2.stu2();
    }
}
