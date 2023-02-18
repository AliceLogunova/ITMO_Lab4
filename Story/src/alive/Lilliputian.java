package alive;
import java.util.Objects;

public abstract class Lilliputian implements IStats{
    public abstract String moveHands(Lilliputian name);
    public abstract String walk(Lilliputian name, String place);
    public abstract String help(Lilliputian name, Lilliputian friendName);
    public abstract String askForHelp(Lilliputian name, Lilliputian friendName);
    public abstract String watchFilm(Lilliputian name, Lilliputian friendName);
    public abstract String stopWatchingFilm(Lilliputian name, Lilliputian friendName);

    protected double a;
    protected double b;
    public String name;
    protected String friendName;


    Lilliputian(String name, String friendName, double a, double b) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.friendName = friendName;

    }
    @Override
    public double getA(){
        return this.a;
    }
    @Override
    public double getB(){
        return this.b;
    }
    @Override
    public double setA(double a){
        this.a = a;
        return a;
    }
    @Override
    public double setB(double b){
        this.b = b;
        return b;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getFriendName() {
        return this.friendName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lilliputian that = (Lilliputian) o;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0 && Objects.equals(name, that.name) && Objects.equals(friendName, that.friendName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, name, friendName);
    }

    @Override
    public String toString() {
        return "Lilliputian{" + "a=" + a + ", b=" + b + ", name='" + name + '\'' + ", friendName='" + friendName + '\'' + '}';
    }
}
