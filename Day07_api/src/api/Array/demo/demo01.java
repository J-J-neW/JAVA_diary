package api.Array.demo;

import java.util.ArrayList;

public class demo01 {
    public static void main(String[] args) {
        //创建一个空的集合对象
        ArrayList<String> list = new ArrayList<>();

        //将指定的元素添加到此集合的末尾
        list.add("Java");
        list.add("java");
        list.add("6");
        list.add("777");
        System.out.println(list);

        //在此集合的指定位置和中插入指定元素
        list.add(4,"abc");
        System.out.println(list);

        //返回指定索引处的元素
        String str = list.get(2);
        System.out.println(str);

        //返回集合中的元素个数
        System.out.println(list.size());

        //删除指定索引处的元素，返回被删除的元素
        String str2 = list.remove(0);
        System.out.println(list);
        System.out.println(str2);

        //删除指定的元素，返回删除成功
        boolean b = list.remove("abc");
        System.out.println(list);
        System.out.println(b);

        //修改指定索引处的元素，返回被修改的元素
        String str3 = list.set(1,"Hello");
        System.out.println(list);
        System.out.println(str3);
    }
}
