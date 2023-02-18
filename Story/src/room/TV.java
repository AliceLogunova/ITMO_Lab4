package room;

public abstract class TV {
    public abstract String turnOff(TV tv);
    public abstract String glich(TV screen);

    protected String screen;
    protected String tv;

    TV(String screen, String tv){
        this.screen = screen;
        this.tv = tv;
    }

    public String getScreen() {
        return this.screen;
    }
    public String getTv(){
        return this.tv;
    }
}
