package notLilliputian;

public class BossOfBandits extends Bandits{
    public BossOfBandits(String status, String statusOfOthers, String values){
        super(status, statusOfOthers, values);
    }
    //////проверяемое исключение
    public static class IsNotBossException extends Exception {
        public IsNotBossException(String message) {
            super(message);
        }
    }

    @Override
    public String getStatus() throws IsNotBossException {
        boolean b = this.status.equals("Boss of bandits");
        if (b) {
            return "It's ok you can go on";
        } else {
            throw new IsNotBossException("This criminal is not the head");
        }
    }

    @Override
    public String help(Bandits status, Bandits statusOfOthers){
        try {
            return statusOfOthers.getStatusOfOthers() + " rushed to rescue their " + status.getStatus();
        } catch (IsNotBossException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    @Override
    public String steal(Bandits statusOfOthers, String values){
        return null;
    }
}
