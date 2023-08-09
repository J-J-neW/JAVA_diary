package method.test;

public class methodTest01 {

    public static void main(String[] args) {

        //内容：遍历数组并按要求打出了[10,20,30,40,50]

        int[] test = {10,20,30,40,50};

        printString(test);//[10,20,30,40,50]

    }

    public static void printString(int[] x){

        System.out.print("[");
        for (int i = 0; i < x.length; i++) {

            if (i == (x.length - 1)) {

                System.out.print(x[i]);

            }
            else
            {
                System.out.print(x[i] + ",");
            }

        }

        System.out.println("]");

    }

}
