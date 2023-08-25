package N5_block;

public class Test {
    public static void main(String[] args) {
        //认识两种代码块，静态代码块以及实例代码块
        //无论执行多少次，静态代码块只会出现一次有且只有一次在最上面
        System.out.println(Student.age);
        System.out.println(Student.age);
        System.out.println(Student.age);

        System.out.println(Student.name);

        //实例代码块，每当你创建对象就会执行一次，下面的情况，实例代码块执行了两次
        Student s1 = new Student();
        Student s2 = new Student(2);

    }
}
