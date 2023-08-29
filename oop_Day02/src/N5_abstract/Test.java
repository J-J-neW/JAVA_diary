package N5_abstract;

public class Test {
    public static void main(String[] args) {
        //掌握抽象类的好处
        Animal a1 = new Cat();
        a1.setName("叮当猫,");
        a1.cry();
        Animal a2 = new Dog();
        a2.setName("狗不理,");
        a1.cry();
    }
}
