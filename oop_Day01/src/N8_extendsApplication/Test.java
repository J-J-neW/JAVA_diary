package N8_extendsApplication;

public class Test {
    public static void main(String[] args) {
        //使用继承的好处：减少重复代码的编写
        //继承之后子类和父类是共同参与了编写

        Z z = new Z();
        z.setName("波妞");
        z.setSkill("java，c");
        System.out.println(z.getName());
        System.out.println(z.getSkill());

        z.printInfo();
    }
}
