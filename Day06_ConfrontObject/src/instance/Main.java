package instance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1,"水门桥",31,7.7,"徐克", "吴京","12万人想看");
        movies[1] = new Movie(2,"出拳吧",39,8.7,"唐晓白", "田晨","3.5万人想看");
        movies[2] = new Movie(3,"月球陨落",29,9.3,"罗兰", "贝瑞","17.9万人想看");
        movies[3] = new Movie(4,"一点就到家",41,6.2,"许宏宇", "刘昊然","10.8万人想看");

        MovieOperator operator = new MovieOperator(movies);
        //operator.allMovies();
        //operator.idMovies(2);

        while (true){
            System.out.println("请输入你需要查询的信息：");
            System.out.println("1、查看电影所有信息");
            System.out.println("2、根据id查询电影");
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            switch(index){
                case 1:
                    operator.allMovies();
                    break;
                case 2:
                    System.out.println("请输入需要查询的电影id");
                    int command = sc.nextInt();
                    operator.idMovies(command);
                    break;
                default:
                    System.out.println("没有此选项哦！");
                    break;
            }
        }
    }
}
