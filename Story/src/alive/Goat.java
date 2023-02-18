package alive;

//import communalka.CommunalServices;
//import communalka.Light;
//import communalka.Water;
import notLilliputian.Bandits;
import room.Soap;
import room.Uvula;

public class Goat extends Lilliputian implements IPaidable, IWashable{

    public LiliputianAccount account;
    public Goat(String name, String friendName, double a, double b, int cashAmount){
        super(name, friendName, a, b);
        try{
            this.account = new LiliputianAccount(cashAmount);
        }
        catch (TooRichException e){
            this.account = new LiliputianAccount(20);
        }

    }
    //////непроверяемое исключение
    public class TooRichException extends RuntimeException {
        TooRichException(){
            super("Oh no! Your Liliputian is too rich for us!");
        }
    }
    //////внутренний нестатический класс
    public class LiliputianAccount {
        private int coinsCount;
        LiliputianAccount(int coinsCount){
            if (coinsCount > 20)
                throw new TooRichException();
            this.coinsCount = coinsCount;
        }
        void withdrawCoin(){
            this.coinsCount--;
            System.out.println("There was a withdrawal of money");
        }

        void addCoin(){
            this.coinsCount++;
            System.out.println("There was a addition of money");
        }
    }

    @Override
    public String moveHands(Lilliputian n){
        return  n.getFriendName() + " gave the santik to uvula";
    }
    @Override
    public String walk(Lilliputian n, String place){
        return Gerunds.SEEINGSOMETHINGWRONG + ", " + n.getName() + " ran to " + place;
    }
    @Override
    public String stopWatchingFilm(Lilliputian n, Lilliputian k){
        return n.getName() + " and " + k.getFriendName() + " still failed to watch this exciting film to the end";
    }
    @Override
    public String help(Lilliputian n, Lilliputian k){
        return n.getFriendName() + " helped " + k.getName();
    }
    @Override
    public String askForHelp(Lilliputian n, Lilliputian k){
        return null;
    }

    @Override
    public String watchFilm(Lilliputian n, Lilliputian k){
        return n.getFriendName() + " and " + k.getName() + " watched the movie from the middle and could not understand where and what ";
    }
    @Override
    public String pay(Lilliputian n, String serviceName, String money) {
        this.account.withdrawCoin();
        return Gerunds.REALIZING + " that the payment for the " + serviceName + " is again required, " + n.getName() + " ran to the uvula " + Gerunds.PULLINGOUT + " of pocket " + money;
    }
    public String stopEverything(Uvula uvula){
        return "When the " + uvula.getName() + " stuck out for the fifth time, ";
    }
    public String decideToWash(Soap soap, Lilliputian k, String money, String towel){
        return k.getName() + " decided to wash himself and went to the washstand, but even here he had to spend a " + money + " for water, a " + money + " for " + soap.getName() + " and a " + money + " for " + towel;
    }
    @Override
    public String wash(Lilliputian n, Lilliputian k) {
        return n.getFriendName() + " washed himself";
    }

}
