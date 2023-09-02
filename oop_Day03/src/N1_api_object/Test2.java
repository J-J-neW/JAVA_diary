package N1_api_object;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Object类提供的常用方法---clone克隆
         User u1 = new User("播妞","123",18,new double[]{99,99.5});
        System.out.println(u1.getName());
        System.out.println(u1.getPassWord());
        System.out.println(u1.getScore());
        System.out.println(u1.getAge());
        System.out.println(u1);

        User u2 = (User) u1.clone();
        System.out.println(u2.getName());
        System.out.println(u2.getPassWord());
        System.out.println(u2.getScore());
        System.out.println(u2.getAge());
        System.out.println(u2);
    }
}