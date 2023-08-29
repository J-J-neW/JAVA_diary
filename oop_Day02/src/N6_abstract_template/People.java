package N6_abstract_template;

public abstract class People {
    public void write(){
        System.out.println("\ttitle");
        System.out.println("  Hello~~");
        System.out.println(writeMain());
        System.out.println("World~~");
    }

    public abstract String writeMain();
}
