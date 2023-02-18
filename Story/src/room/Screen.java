package room;

public class Screen extends TV{
    public Screen(String  screen, String tv){
        super(screen, tv);
    }
    @Override
    public String turnOff(TV tv){
        return tv.getTv() + " suddenly turned off, ";
    }
    @Override
    public String glich(TV screen){
        return "The " + screen.getScreen() + " is still flickering, ";
    }
}
