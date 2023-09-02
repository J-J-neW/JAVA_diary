package N2_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //Objects提供的常用方法
        //1、Objcets.equals先做空判断，再比较两个对象
        //2、判断对象是否为null，为null返回true，反之false
        String s1 = null;
        String s2 = "Hello";

        //当s1使用的是null指针，equals就会报错
        //System.out.println(s1.equals(s2));
        //1、Objcets.equals先做空判断，再比较两个对象
        System.out.println(Objects.equals(s1, s2));

        //2、判断对象是否为null，为null返回true，反之false
        System.out.println(Objects.isNull(s1));

        //3、判断对象是否为null，为null返回false，反之true
        System.out.println(Objects.nonNull(s1));
    }
}
