package practice.javabean;

public class StudentOperator {

    //学生对象的另一个分支，让Student不再是一个人
    //让Student负责成绩的输入，让StudentOperator负责信息的输出内容

    private Student student;

    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass(){
        if(student.getScore() >= 60){
            System.out.println(student.getName() + "同学成绩合格");
        }else{
            System.out.println(student.getName() + "同学成绩不合格");
        }
    }
}
