public class Disney implements Platform{
    private String platformName;

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public Disney(String platformName) {
        this.platformName = platformName;
    }

    public void seeMovieAvengers(){
        System.out.println("En: "+getPlatformName()+" estamos viendo The Avengers");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
