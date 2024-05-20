public class Netflix implements Platform{

    private String platformName;

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public Netflix(String platformName) {
        this.platformName = platformName;
    }

    public void seeSeriesDark(){
        System.out.println("En: "+getPlatformName()+" estamos viendo Dark");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
