package N10_extendsOverride;

public class Test {
    public static void main(String[] args) {
        //认识方法重写
        //当子类觉得父类的方法不好用，或者无法满足时，子类可以重写一个参数列表一样的方法，去覆盖父类的这个方法
        //方法的访问，java遵循就近原则

        //当方法没重写时打印的结果均为父类的结果，重写之后开始转变
        Z z = new Z();
        z.print1();
        z.print1(1);

    }
}
