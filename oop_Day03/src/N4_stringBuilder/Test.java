package N4_stringBuilder;

public class Test {
    public static void main(String[] args) {
        //掌握stringBuilder的用法和作用
        StringBuilder s = new StringBuilder("Hello");

        //1、拼接内容
         s.append("World");
         s.append(777);
         s.append(",./");
        System.out.println(s);

        //支持链式编程
        s.append(111).append(222).append(333);
        System.out.println(s);

        //2、反转操作
        s.reverse();
        System.out.println(s);

        //3、返回字符串长度
        System.out.println(s.length());

        //4、把stringBuilder对象转换成string类型
        System.out.println(s.toString());

    }
}
