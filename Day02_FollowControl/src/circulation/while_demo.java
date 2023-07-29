package circulation;

public class while_demo {
    public static void main(String[] args) {


        //while与for类似，但知道所需范围通常选择的是for，不确定的范围选while


        int i = 0;

        while (i < 5)
        {
            System.out.println("Hello World");
            i++;
        }



        //列：
        //求一个已知数，计算一张0.1毫米高的纸张，需要跌多少次才有山峰高

        double peakHeight = 8848860;
        double paper = 0.1;

        int count= 0;


        while (paper < peakHeight)
        {
            paper *= 2;
            count++;
        }
        System.out.println("需要折叠多少次"+ count);
        System.out.println(paper);
    }
}
