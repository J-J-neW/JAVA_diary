package practice.ThisDemo;

public class Test {

    //this能作用于两个相同的变量之间，还是有点难度的
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();
        s1.score = 100;

        s1.printScore(200);
    }
}
