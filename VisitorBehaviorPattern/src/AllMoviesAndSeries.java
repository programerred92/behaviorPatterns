public class AllMoviesAndSeries implements Visitor{
    @Override
    public void visit(Netflix netflix) {
        System.out.println("Viendo de netflix");
        netflix.seeSeriesDark();
    }

    @Override
    public void visit(HBO hbo) {
        System.out.println("Viendo de HBO");
        hbo.seeSeriesHalo();
    }

    @Override
    public void visit(Disney disney) {
        System.out.println("Viendo de disney");
        disney.seeMovieAvengers();
    }
}
