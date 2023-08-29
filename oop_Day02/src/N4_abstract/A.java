package N4_abstract;

//抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
public abstract class A {
    private String name;

    public abstract void test();

    //类该有的成员（成员变量、方法、构造器）抽象类都可以有
    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
