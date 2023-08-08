public class array_demo01 {
    public static void main(String[] args) {

        //静态数组，


        //第一种形式
        /*
        int[] i = new int[]{1,2,3,4};

        //第二种形式
        int[] j = {1,2,3,4};

        System.out.println(i);//这种形式通常是访问到数组的地址：[I@776ec8df

        System.out.println(i[0]);//数组的访问需要以这种形式，才能访问到数组里面的元素
        */

        //遍历数组

        int[] num = {10, 20, 30, 40};

        /*
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);*/


        //当数组变大，再一个个遍历的话将会很麻烦
        //可以用for循环解决这个问题

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }
}
