package practice.ThisDemo;

public class Student {

    double score;

    public void printThis(){
        System.out.println(this);
    }

    //这里的this直接指向了外面的score，避免了同名变量
    public void printScore(double score){
        if(this.score > score){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }
}
