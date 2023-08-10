package practice.easy;

import java.util.Random;

public class Captcha {

    public static void main(String[] args) {

        System.out.println(createCode(5));

    }

    public static String createCode(int n){

        //涉及到String以及char的运用，ASCLL码

        Random r = new Random();
        String code = "";

        for (int i = 1; i <= n; i++) {

            int type = r.nextInt(3);
            //验证码的3种类型，0代表纯数字，1代表大写字母，2代表小写字母

            switch (type){

                case 0:
                    code += r.nextInt(9);
                    break;
                case 1:
                    char ch1 = (char)(r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    char ch2 = (char)(r.nextInt(26) + 97);
                    code += ch2;
                    break;
            }

        }

        return code;

    }

}
