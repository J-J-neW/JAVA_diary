package api.String.test;

import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        for (int i = 0; i < n; i++) {
            System.out.println("用户名：");
            String userName = sc.next();
            System.out.println("密码：");
            String passWord = sc.next();

            if(login(userName,passWord)){
                System.out.println("登录成功！");
                break;
            }else{
                System.out.println("用户名或密码错误，请重新输入：");
            }

            if(i == n-2){
                System.out.println("这是最后一次机会了！");
            }
        }

    }

    public static boolean login(String userName,String passWord){
        String okuserName = "admin";
        String okpassWord = "useradmin";

        if(okuserName.equals(userName) && okpassWord.equals(passWord)){
            return true;
        }else{
            return false;
        }
    }
}
