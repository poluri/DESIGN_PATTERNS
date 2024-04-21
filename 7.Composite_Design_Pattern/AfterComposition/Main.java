package AfterComposition;
public class Main {
    public static void main(String[] args) {

         File idiots = new File("3idiots");
         File mbbs = new File("Munna Bhai MBBS");
         File golmal = new File("Golamal");
         File border = new File("Border");

         Directory d = new Directory("Raju Hirani");
         d.add(idiots);
         d.add(mbbs);

         Directory comedy = new Directory("Comedy Movies");
         comedy.add(golmal);
         comedy.add(d);

         Directory movies = new Directory("Movies");
         movies.add(border);
         movies.add(comedy);


         movies.ls();


    }
}
