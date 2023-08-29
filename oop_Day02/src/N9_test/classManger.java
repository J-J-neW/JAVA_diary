package N9_test;

import java.util.ArrayList;

public class classManger {
    private ArrayList<Student> students = new ArrayList<>();
    private studentOperator studentOperator = new studentOperatorImpl2();

    public classManger() {
        //Student s1 = new Student();
        //students.add(s1);
        students.add(new Student("马尔扎哈",'男',100));
        students.add(new Student("卡莎",'女',98));
        students.add(new Student("亚托克斯",'男',79));
        students.add(new Student("艾瑞利亚",'女',91));
    }

    //打印全班学生信息
    public void printInfo(){
        studentOperator.printClassInfo(students);
    }

    //打印全班学生的平均分
    public void printScore(){
        studentOperator.printClassScore(students);
    }
}
