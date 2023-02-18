package notLilliputian;

import alive.Gerunds;

public class Cops {
    public String cops;

    public Cops(String cops){
        this.cops = cops;
    }
    public String hook(BossOfBandits status, Cops cops){
        try {
            return "At the most interesting place, when the " + status.getStatus() + " was about to be captured by " + cops.getCops() + " , ";
        } catch (BossOfBandits.IsNotBossException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public String askForHelp(Cops cops, String who){
        return "and then called for help armored" + who;
    }
    public String attack(OtherBandits otherBandits,Cops cops){
        return cops.getCops() + " bombarded " + otherBandits.getStatusOfOthers() + " with tear gas, ";
    }
    public String chase(OtherBandits otherBandits,Cops cops){
        return " and again set off in pursuit, " + Gerunds.CRUSHING + " and " + Gerunds.BREAKING + " everything in theirs path";
    }
    public String getCops(){
        return this.cops;
    }
}
