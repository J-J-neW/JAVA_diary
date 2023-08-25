package N10_extendsOverride;

public class Z extends F{
    //创建一个一样的方法来重写
    //可以用@Override来辨别重写方法是否有效

    @Override
    //当我们把父类的void类型进行更改，@Override就会识别到，从而报错
    public void print1(){
        System.out.println("222");
    }

    @Override
    public void print1(int i){
        System.out.println("222222");
    }
}
