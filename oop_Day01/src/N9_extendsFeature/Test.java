package N9_extendsFeature;

public class Test {
    public static void main(String[] args) {
        //继承的两个注意事项
        //1、JAVA是单继承的，一个类只能继承一个直接父类，Java不支持多继承，但支持多层继承
        //2、Object是所有类的祖宗

        //在Y类中是自带一个object来继承的，虽然他不显示出来
        //等同于
        /*class Y extends Object{

        }*/
        class Y{

        }
        class F extends Y{

        }
        class Z extends F{

        }
    }
}
