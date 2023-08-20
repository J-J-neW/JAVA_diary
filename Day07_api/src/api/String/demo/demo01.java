package api.String.demo;

public class demo01 {
    public static void main(String[] args) {

        //String创建对象封装字符串数据的方式
        //常见的字符串类型
        String s = "HelloWorld";
        System.out.println(s);


        //调用String类的构造器
        String str = new String();
        System.out.println(str);
        String str1 = new String("Hello");
        System.out.println(str1);

        char[] ch = {'W','o','r','l','d'};
        System.out.println(ch);
        String str2 = new String(ch);
        System.out.println(str2);

        byte[] bt = {97,98,99};
        String str3 = new String(bt);//a = 97,b = 98,c = 99
        System.out.println(str3);
    }
}
