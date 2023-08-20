package practice.TestDemo;

public class Student {

    String name;
    double chineses;
    double math;

    public void printTotalScore(){
        System.out.println(name + "的总分成绩是：" + (chineses + math));
    }

    public void printAverageScore(){
        System.out.println(name + "的平均分成绩是：" + (chineses + math)/2);
    }
}
