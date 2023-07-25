public class operator_04 {
    public static void main(String[] args) {


        //基本的自增自减


        int a = 10;
        int b = 20;

        System.out.println(++a);//11
        System.out.println(++b);//21

        System.out.println(--a);//10
        System.out.println(--b);//20


        //--与++的先后顺序是有差别的
        int i = 10;
        int j = 20;

        int sum = --i + j++;
        System.out.println(i);//9
        System.out.println(j);//21
        System.out.println(sum);//29

    }
}
