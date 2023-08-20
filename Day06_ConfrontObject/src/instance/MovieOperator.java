package instance;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] Movies){
        this.movies = Movies;
    }

   public void allMovies(){
       System.out.println("------电影信息如下：------");
       for (int i = 0; i < movies.length; i++) {
           Movie m = movies[i];
           System.out.println("编号：" + m.getId());
           System.out.println("名称：" + m.getName());
           System.out.println("价格：" + m.getPrice());
           System.out.println("-----------------");
           System.out.println();
       }

   }

   public void idMovies(int id){
       for (int i = 0; i < movies.length; i++) {
           Movie m = movies[i];
           if(m.getId() == id){
               System.out.println("------该电影信息如下：------");
               System.out.println("编号：" + m.getId());
               System.out.println("名称：" + m.getName());
               System.out.println("价格：" + m.getPrice());
               System.out.println("分数：" + m.getScore());
               System.out.println("导演：" + m.getDirector());
               System.out.println("演员：" + m.getActor());
               System.out.println("其他信息：" + m.getInfo());
               System.out.println("--------------------");
               System.out.println();
               return;
           }
       }
       System.out.println("没有该电影信息！");
   }
}
