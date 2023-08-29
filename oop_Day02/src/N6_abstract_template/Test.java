package N6_abstract_template;

public class Test {
    public static void main(String[] args) {
        //抽象类的应用场景之一，设计模板方法

        Teacher t = new Teacher();
        t.write();
        System.out.println("-------------------------");

        Student s = new Student();
        s.write();
    }
}
