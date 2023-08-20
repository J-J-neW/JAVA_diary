package practice.javabean;

public class Test {
    public static void main(String[] args) {

        //熟悉后，用快捷指令让set与get指令更便捷

        Student s1 = new Student();
        s1.setName("zs");
        s1.setScore(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();
    }
}
