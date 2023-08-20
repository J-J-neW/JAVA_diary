package practice.TestDemo;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.chineses = 90;
        s1.math = 100;
        s1.printTotalScore();
        s1.printAverageScore();

        Student s2 = new Student();
        s2.name = "小美";
        s2.chineses = 100;
        s2.math = 95;
        s2.printTotalScore();
        s2.printAverageScore();
    }
}
