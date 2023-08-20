package api.Array.test02;

import java.util.ArrayList;
import java.util.Scanner;

public class foodOperator {
    ArrayList<food> foodList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addFood(){
        food f = new food();
        System.out.println("请输入菜品名称：");
        String name = sc.next();
        f.setName(name);
        System.out.println("请输入菜品价格： ");
        double price = sc.nextDouble();
        f.setPrice(price);
        System.out.println("请输入菜品描述：");
        String desc = sc.next();
        f.setDesc(desc);

        foodList.add(f);
        System.out.println("上架成功 !");
    }

    public void showAllFood(){
        for (int i = 0; i < foodList.size(); i++) {
            food f = foodList.get(i);
            System.out.println("菜品：" + f.getName());
            System.out.println("价格：" + f.getPrice());
            System.out.println("描述：" + f.getDesc());
            System.out.println("-------------------");

        }
    }

    public void start(){
        while (true) {
            System.out.println("请输入需要的操作：");
            System.out.println("1、上架菜品");
            System.out.println("2、展示菜品");
            System.out.println("3、退出");
            String index = sc.next();

            switch (index){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFood();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("你的输入有误请重新输入！");
                    System.out.println("---------------------");
            }
        }
    }
}
