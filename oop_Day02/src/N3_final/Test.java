package N3_final;

public class Test {
    public static void main(String[] args) {
        //认识final的作用
        //修饰类：该类被称为最终类，特点是不能被继承了
        //修饰方法：该方法被成为最终方法，特点是不能被重写
        //修饰变量：该变量只能被赋值一次

        //3、修饰变量：该变量只能被赋值一次
        final int a = 0;
        //无法进行二次赋值，否则将会报错
        //a = 8;
        final String s = "Hello";
        //s = "Word";
    }

}

//1、修饰类：该类被称为最终类，特点是不能被继承了
final class A{

}
//B无法继承A
    /*class B extends A{

    }*/

//2、修饰方法：该方法被成为最终方法，特点是不能被重写
class C{
    public final void test(){

    }
}
//当方法被final修饰，将不能进行重写
/*class D extends C{
        @Override
        public void test() {
            super.test();
        }
   }*/

