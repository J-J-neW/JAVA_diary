package practice.Encapsulation;

public class Test {
    public static void main(String[] args) {

        //封装：要把处理的数据，以及处理这些数据的方法，设计到一个对象中去
        //合理隐藏，合理暴露

        Student s1 =new Student();
        s1.setScore(200);
        System.out.println(s1.getScore());
    }
}
