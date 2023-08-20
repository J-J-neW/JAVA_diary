package practice.Constructor;

public class Student {
    String name;
    double score;
    //无参数构造器
    public Student(){
        System.out.println("1");
    }

    //有参数构造器
    public Student(String name,double score){
        System.out.println("2");
        this.name = name;
        this.score = score;
    }
}
