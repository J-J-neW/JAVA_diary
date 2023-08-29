package N9_test;

import java.util.ArrayList;

public class studentOperatorImpl1 implements studentOperator{
    @Override
    public void printClassInfo(ArrayList<Student> students) {
        System.out.println("=====全班学生信息=====");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，分数：" + s.getScore());
        }

        System.out.println("================");

    }

    @Override
    public void printClassScore(ArrayList<Student> students) {
        double allScore = 0;
        for (int i = 0; i < students.size(); i++) {
            allScore += students.get(i).getScore();
        }

        System.out.println("平均分为：" + allScore / students.size());
    }
}
