import java.util.Scanner;

public class operator_07 {
    public static void main(String[] args) {



        //scanner之录入数据

        Scanner sc = new Scanner(System.in);//输入这行命令，文件顶部自动添加java预设的程序

        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("请输入你的姓名：");
        String name = sc.next();

        System.out.println("你输入的信息为，年龄：" + age +"，姓名：" + name );
        System.out.println("亲爱的" + name + "欢迎你");
    }
}
