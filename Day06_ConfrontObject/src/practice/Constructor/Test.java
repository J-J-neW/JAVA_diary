package practice.Constructor;

public class Test {

    //关于构造器的学习
    //当结构体里面没有构造器，java会在结构体里面自动创建一个无参数构造器
    //当结构体里面有一个有参数构造器，那么主函数的无参数构造器将会无效

    public static void main(String[] args) {

        Student s1 = new Student();

        //可以避免在主函数一个个引用的方法，
        Student s2 = new Student("zs",99);
        System.out.println(s2.name);
        System.out.println(s2.score);
    }
}
