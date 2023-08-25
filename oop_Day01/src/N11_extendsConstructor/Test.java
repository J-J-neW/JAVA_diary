package N11_extendsConstructor;

public class Test {
    public static void main(String[] args) {

        //子类构造器的特点：
        //子类的全部构造器，都会先调用父类的构造器，再执行自己
        Z z = new Z();
        System.out.println("-----------------------");
        Z z2 = new Z(1);

    }
}

class F{
    /*public F(){
        System.out.println("父类无参数构造器");
    }*/

    public F(int i,int j){

    }
}

class Z extends F{

    //当父类没有无参数构造器时，子类的构造器都会无效
    public Z(){
        super(1,2);//当我们使用super时，去指定调用父类的有参构造器，这样就不会报错了
        System.out.println("子类无参数构造器");
    }

    public Z(int i){
        super(1,2);//当我们使用super时，去指定调用父类的有参构造器，这样就不会报错了
        System.out.println("子类有参数构造器");
    }
}
