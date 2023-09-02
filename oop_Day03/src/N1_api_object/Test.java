package N1_api_object;

public class Test {
    public static void main(String[] args) {

        //Object类提供的常用方法
        //1、返回对象的字符串表示形式
        Student s1 = new Student("播妞",99);
        //默认打印对象的地址
        //System.out.println(s1.toString());
        System.out.println(s1);

        //2、判断两个对象是否相等
        Student s2 = new Student("播妞",99);
        //equals默认比较的是地址，因为是new了一个对象所以地址不一样，打印的是false
        //System.out.println(s1.equals(s2));//false
        //可以通过方法重写来实现equals比较两个对象的内容
        System.out.println(s1.equals(s2));//true



    }
}
