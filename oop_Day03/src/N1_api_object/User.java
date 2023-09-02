package N1_api_object;

//Cloneable是一个标记接口
public class User implements Cloneable{
    private String name;
    private String passWord;
    private int age;
    private double[] score;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //super去调用父类Object中的clone的方法
        return super.clone();
    }

    public User() {
    }

    public User(String name, String passWord, int age, double[] score) {
        this.name = name;
        this.passWord = passWord;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }
}
