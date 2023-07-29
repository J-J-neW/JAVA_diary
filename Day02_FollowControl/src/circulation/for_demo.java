package circulation;

public class for_demo {
    public static void main(String[] args) {

        /*没有学习循环之前，一行行的打印，费时又费力

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        */


        //学完只需要两条代码，便可以省去许多的不必要
        //列1：
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }


        System.out.println("-------------------------------");


        //列2：
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
