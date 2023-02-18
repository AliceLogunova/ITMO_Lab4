package notLilliputian;

public class OtherBandits extends Bandits{
    public OtherBandits(String status, String statusOfOthers, String values){
        super(status, statusOfOthers, values);
    }

    @Override
    public String help(Bandits status, Bandits statusOfOthers){
        try {
            return "At the most interesting place when " + status.getStatus();
        } catch (BossOfBandits.IsNotBossException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    @Override
    public String steal(Bandits statusOfOthers, String values){
        return values + " stole " + statusOfOthers.getStatusOfOthers();
    }
}
