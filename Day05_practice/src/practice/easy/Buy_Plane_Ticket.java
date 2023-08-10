package practice.easy;

import java.util.Scanner;

public class Buy_Plane_Ticket {

    //涉及到switch的灵活运用

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入你需要购买几月份的机票：");
        int month = sc.nextInt();
        System.out.println("需要头等舱 or 经济舱？");
        String type = sc.next();
        System.out.println("请输入你需要买的机票价格：");
        double money =sc.nextDouble();

        double sum = calculate(money,month,type);
        System.out.println("结合优惠价格，您最后需要支付：" + sum);

    }

    public static double calculate(double money,int month,String type){

        if(month >= 5 && month <= 10){

            switch (type){

                case "头等舱":
                    money *= 0.9;
                    break;


                case "经济舱":
                    money *= 0.85;
                    break;

            }

        }else{

            switch (type){

                case "头等舱":
                    money *= 0.7;
                    break;

                case "经济舱":
                    money *= 0.65;
                    break;

            }


        }

        return money;

    }

}
