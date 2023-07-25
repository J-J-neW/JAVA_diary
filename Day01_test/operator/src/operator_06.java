public class operator_06 {
    public static void main(String[] args) {


        //关系运算符
        //>, >=, <, <=, ==, !=

        //编程的=与数学的=不是一个性质，
        //编程的=是赋值的意思数学的=才是两边的数相等，而编程的等于是==

        int i = 10;
        int j = 20;

        System.out.println(i > j);//false
        System.out.println(i >= j);//false
        System.out.println(i < j);//true
        System.out.println(i <= j);//true
        System.out.println(i != j);//true
        System.out.println(i == j);//false两者是不等于的


        System.out.println("-----------------------------------------------");

        //逻辑运算符
        //& 逻辑与-----> 2>1 & 3>2 ----> 两个条件都是true，结果才是true
        //| 逻辑或-----> 2>3 | 4>2 ----> 两个条件，其中一个是true，结果就为true
        //! 逻辑非-----> !(2>3) ----> 结果取反，对的结果是false(!true == false)，错的结果是true
        //^ 逻辑异或-----> 2>1 ^ 3>1 ----> 两个结果相同的，结果为false，两个结果不同返回的才是ture

        double a = 10.5;
        int b = 10 ;

        //列：
        boolean rs = a >= 5 & b >= 5;//逻辑与
        System.out.println(rs);//true
        boolean rs1 = a > 10 & b > 10;//逻辑与
        System.out.println(rs1);//false


        System.out.println("-----------------------------------------------");



        //三元运算符
        //条件 ？ 变量a ： 变量b
        //如果条件为真结果输出为变量a，反之则输出变量b

        //列如，我们要取两个数中的最大值
        int a1 = 10;
        int b1 =  20;

        int max = a1 > b1 ? a1 : b1;
        System.out.println(max);//20


    }
}
