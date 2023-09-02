package N3_api_integer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //掌握包装类的使用
        //Integer i = new Integer(12);//过时
        Integer a1 = Integer.valueOf(12);
        System.out.println(a1);

        //自动装箱：可以自动把基本类型的数据转换成对象
        Integer a2 = 7;
        System.out.println(a2);

        //自动拆箱：可以自动把包装类型的对象转换成对象的基本数据类型
        int a3 = a2;
        System.out.println(a3);

        //泛型和集合不支持基本数据类型，只能支持引用数据类型
        //ArrayList<int> arrayList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(777);//自动装箱
        list.add(777);//自动装箱

        int rs = list.get(0);//自动拆箱
        System.out.println(rs);
        System.out.println("------------------------------------");


        //1、把基本类型的数据转换成字符串
        Integer a = 123;
        String str = Integer.toString(a);
        System.out.println(str + 1);

        String str2 = a.toString();
        System.out.println(str2 + 1);

        String str3 = a + "";
        System.out.println(str3 + 1);


        //2、把字符串类型的数值转换成对应的基本类型
        //转换也有要求，必须是对应的类型，int就只能是整数，不能是111a或者111.5
        String ageStr = "111";
        //int ageI = Integer.parseInt(ageStr);
        int ageI = Integer.valueOf(ageStr);
        System.out.println(ageI + 100);//211

        String ageStr2 = "99.5";
        //double ageD = Double.parseDouble(ageStr2);
        double ageD = Double.valueOf(ageStr2);
        System.out.println(ageD + 0.5);

    }
}