package practice.easy;

public class array_copy {

    public static void main(String[] args) {

        int[] array = {11,22,33};
        int[] array2 = copy(array);

        printArray(array2);
    }

    public static void printArray(int[] array){

        //一个专门打印的方法，当作练习
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

    }

    public static int[] copy(int[] array){

        //常规拷贝数组
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            array2[i] = array[i];

        }

        return array2;

    }

}
