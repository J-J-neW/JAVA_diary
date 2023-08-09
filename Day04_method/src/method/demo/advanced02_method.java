package method.demo;

public class advanced02_method {

    public static void main(String[] args) {

        //return 可以当作断句符号
        //当你输入了return，return下面的语句将不会运行
        //在void的方法类型中，若要编写return语句，只能编写为： return; 不可后面带返回值。


        //用a除b，但是0不能被整除，可以用return断句

        //当我们为了防止乱输入a与b的数值时，可以用return退出

        compare(10,2);


    }

    public static void compare(double x,double y){

        if(x == 0 && y == 0)
        {
            System.out.println("出现了错误，请重新输入");
            return;
        }

        double z = x / y;
        System.out.println("a 除 b的结果是：" + z);

    }

}
