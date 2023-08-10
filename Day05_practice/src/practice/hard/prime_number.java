package practice.hard;

public class prime_number {

    //求素数的简单办法之一，这个需要想法，也是参照了许多例子才写出来的
    public static void main(String[] args) {

        for (int i = 101; i <= 200; i++) {

            if(check(i)){

                System.out.println(i);

            }

        }

    }

    public static boolean check(int data){

        for (int i = 2; i <= data / 2; i++) {

            if(data % i == 0){

                return false;

            }

        }

        return true;

    }

}
