package N4_stringBuilder;

public class Test2 {
    public static void main(String[] args) {

        //掌握stringBuilder的好处
        //举例，拼接abc，100万次

        //平常的方法
        //平常的方法十分的慢
//        String str = "";
//        for (int i = 1; i <= 1000000; i++) {
//            str = str + "abc";
//        }
//        System.out.println(str);

        //使用stringBuilder
        //使用stringBuilder肉眼可见的快速
        StringBuilder str2 = new StringBuilder();
        for (int i = 1; i <= 1000000; i++) {
            str2.append("abc");
        }
        System.out.println(str2);

    }
}