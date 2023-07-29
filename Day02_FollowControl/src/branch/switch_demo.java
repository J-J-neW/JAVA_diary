package branch;

public class switch_demo {
    public static void main(String[] args) {


        //switch里的break结束语很重要！
        //表达式的类型只能是：byte,short,char,int,String以及枚举
        //case的值只能是字面量，且不能重复


        String week = "周三";

        switch (week)
        {
            case "周一":
                System.out.println("星期一的工作真是烦躁！");
                break;

            case "周二":
                System.out.println("星期二暴躁");
                break;

            case "周三":
                System.out.println("星期三愉悦");
                break;

            case "周四":
                System.out.println("星期四开心");
                break;

            case "周五":
                System.out.println("星期五快乐");
                break;

            case "周六":
                System.out.println("星期六满足");
                break;

            case "周日":
                System.out.println("星期天无能狂怒");
                break;

            default:
                System.out.println("你的输入有错误，！");
                break;
        }
    }
}
