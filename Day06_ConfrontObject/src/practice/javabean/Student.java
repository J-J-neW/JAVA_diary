package practice.javabean;

public class Student {
    private String name;
    private double score;

    public Student(){

    }

    //右键，选择Generate，选择Getter and Setter。
    //快速的创建set与get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
