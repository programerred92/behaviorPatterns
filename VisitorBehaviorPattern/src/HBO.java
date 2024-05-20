public class HBO implements Platform{
    private String platformName;

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public HBO(String platformName) {
        this.platformName = platformName;
    }

    public void seeSeriesHalo(){
        System.out.println("En: "+getPlatformName()+" estamos viendo Halo");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
