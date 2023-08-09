package method.test;

public class methodTest02 {
    public static void main(String[] args) {

        //判断这个数是奇数还是偶数
        int a = 13;
        judge(a);

    }

    public static void judge(int x){

        if(x % 2 == 0){

            System.out.println("这个数是偶数");

        }else {

            System.out.println("这个数是奇数");

        }

    }

}
