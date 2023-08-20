package api.String.demo;

public class demo02 {
    public static void main(String[] args) {

        //String提供的操作字符数据的常用方法
        String s = "Hello";

        //length,获取字符串长度
        int length = s.length();
        System.out.println(length);

        //获取某个索引位置处的字符返回
        //  H  e  l  l  o
        //  0  1  2  3  4
        char ch1 = s.charAt(1);
        System.out.println(ch1);

        //将当前字符串转换成字符数组返回
        char[] chars1 = s.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            System.out.println(chars1[i]);
        }

        //判断当前字符串与另一个字符串的内容一样，一样的返回true
        String s1 = "Hello";
        System.out.println(s.equals(s1));

        //判断当前字符串与另一个字符串内容是否一样，忽略大小写
        String str1 = "World";
        String str2 = "wOrlD";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("-----------------------------------------");

        //根据开始和结束索引进行截取，得到新的字符串
        String s2 = "java是一个好编程";
        String sub = s2.substring(0,4);
        System.out.println(sub);

        //从传入的索引处截取，截取到末尾，得到新的字符串返回
        String sub2 = s2.substring(7);
        System.out.println(sub2);

        //使用新值，将字符串中的旧值替换，得到新的字符串
        String s3 = "今天去公园玩的真开心，今天真开心";
        String rp = s3.replace("开心","高兴");
        System.out.println(rp);

        //判断字符串中是否包含了某个字符串
        String s4 = "这游戏真**，以后都不玩这**游戏了";
        System.out.println(s4.contains("*"));//true
        System.out.println(s4.contains("!"));//false

        //判断字符是否以某个字符串开头，是返回true，反之false
        String s5 = "张三丰是个武林高手";
        System.out.println(s5.startsWith("张"));//true
        System.out.println(s5.startsWith("张三"));//true
        System.out.println(s5.startsWith("三"));//false

        //把字符串安装某个字符串内容分割，并返回字符串数组回来
        String s6 = "a,b,c,d";
        String[] letter = s6.split(",");
        for (int i = 0; i < letter.length; i++) {
            System.out.println(letter[i]);
        }
    }
}
