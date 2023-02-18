package notLilliputian;

import java.util.SplittableRandom;

public abstract class Bandits {
    public abstract String help(Bandits status, Bandits statusOfOthers);
    public abstract String steal(Bandits statusOfOthers, String values);

    protected String values;
    protected String status;
    protected String statusOfOthers;


    Bandits(String status, String statusOfOthers, String values){
        this.status = status;
        this.statusOfOthers = statusOfOthers;
        this.values = values;
    }

    public String  getStatus() throws BossOfBandits.IsNotBossException {
        return this.status;
    }
    public String  getStatusOfOthers(){
        return this.statusOfOthers;
    }
}
