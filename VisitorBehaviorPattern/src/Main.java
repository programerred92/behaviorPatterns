public class Main {
    public static void main(String[] args) {
        Netflix netflix = new Netflix("Netflix");
        HBO hbo = new HBO("HBO");
        Disney disney = new Disney("Disney");

        AllMoviesAndSeries allMoviesAndSeries = new AllMoviesAndSeries();
        allMoviesAndSeries.visit(netflix);
        System.out.println("----------------------------");
        allMoviesAndSeries.visit(hbo);
        System.out.println("----------------------------");
        allMoviesAndSeries.visit(disney);
    }
}