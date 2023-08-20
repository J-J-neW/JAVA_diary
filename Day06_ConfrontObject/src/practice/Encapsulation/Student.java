package practice.Encapsulation;

public class Student {

    //合理隐藏
    private double score;// private隐藏，私有

    //合理暴露
    //通过setScore接受上面隐藏了的score
    public void setScore(double score){
        this.score = score;
    }

    //通过getScore解放score
    public double getScore(){
        return score;
    }
}
