package N5_stringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        //掌握stringJoiner的使用
        //1、创建一个stringJoiner对象，指定拼接时的间隔符号
        //StringJoiner str = new StringJoiner(",");
        //2、创建一个stringJoiner对象，指定拼接时的间隔符号、开始符号、结束符号
        StringJoiner str = new StringJoiner(",","[","]");
        //3、添加数据，并返回对象本身
        str.add("111");
        str.add("222");
        str.add("333");
        System.out.println(str);

        //4、返回长度
        System.out.println(str.length());
    }
}
