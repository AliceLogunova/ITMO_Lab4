package alive;

import notLilliputian.Bandits;

public class Dunno extends Lilliputian implements IWashable{
    public Dunno(String name, String friendName, double a, double b) {
        super(name, friendName, a, b);
    }

    @Override
    public String moveHands(Lilliputian n) {
        return n.getFriendName() + " turned the faucet in different positions and kicked it, but it didn't help";
    }
    @Override
    public String walk(Lilliputian n, String place) {
        return "Neznayka walks";
    }
    @Override
    public String stopWatchingFilm(Lilliputian n, Lilliputian k){
        return n.getName() + " and " + k.getFriendName() + " still failed to watch this exciting film to the end";
    }
    @Override
    public String help(Lilliputian n, Lilliputian k) {
        return null;
    }

    @Override
    public String askForHelp(Lilliputian n, Lilliputian k) {
        return "Then " + n.getFriendName() + " started calling for help to " + getName();
    }
    @Override
    public String watchFilm(Lilliputian n, Lilliputian k){
        return n.getName() + " and " + k.getFriendName() + " watched the movie from the middle and could not understand where and what ";
    }
    @Override
    public String wash(Lilliputian n, Lilliputian k) {
        return n.getFriendName() + " started to wash his face " + Adverb.AFTER + " " + k.getName();
    }
    //////параметризированный метод
    public <E> void say(E message){System.out.println(this.getName() + " said next: " + message + "!");}
}
