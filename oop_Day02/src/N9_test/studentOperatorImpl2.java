package N9_test;

import java.util.ArrayList;

public class studentOperatorImpl2 implements studentOperator{
    @Override
    public void printClassInfo(ArrayList<Student> students) {
        double count1 = 0;
        double count2 = 0;

        System.out.println("=====全班学生信息=====");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);

            if(s.getSex() == '男'){
                count1++;
            }else{
                count2++;
            }

            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，分数：" + s.getScore());
        }

        System.out.println("================");
        System.out.println("男生人数：" + count1 + "，女生人数：" + count2);
        System.out.println("================");

    }

    @Override
    public void printClassScore(ArrayList<Student> students) {
        double allScore = 0;
        double maxScore = students.get(0).getScore();
        double minScore = students.get(0).getScore();

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
            if(s.getScore() > maxScore){
                maxScore = s.getScore();
            }else if(s.getScore() < minScore){
                minScore = s.getScore();
            }
        }

        System.out.println("最大值为：" + maxScore + "，最小值为：" + minScore);
        System.out.println("平均分为：" + (allScore - maxScore - minScore) / (students.size() - 2));

    }
}
