package api.String.test;

import java.util.Random;

public class randomCode {
    public static void main(String[] args) {
        System.out.println(creatCode(4));
    }
    public static String creatCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }

        return code;
    }
}
