package branch;

public class if_demo {
    public static void main(String[] args) {


        double a = 70.5;

        if(a >= 0 && a <= 60)
        {
            System.out.println("你的成绩为: D");

        } else if (a > 60 && a <= 70) {
            System.out.println("你的成绩为： C");

        } else if (a > 70 && a <= 85) {
            System.out.println("你的成绩为： B");

        }else {
            System.out.println("你的成绩为： A");

        }

        }
    }

