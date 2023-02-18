package room;

import alive.Gerunds;
import alive.Lilliputian;

public class Uvula extends PremisesObject{
    public Uvula(String obj, String place){
        super(obj, place);
    }

    @Override
    public String beInRoom(PremisesObject uvula, String place){
        //////локальный класс
        class InRoom{
            public String exist(Boolean existing){
                if (existing)
                    return " and a metal " + uvula.getName() + " gleaming ";
                else
                    return " blablabla ";
            }
        }
        InRoom inRoomCheck = new InRoom();
        return inRoomCheck.exist(Boolean.TRUE) + place;
    }
    public String leanOut(Uvula uvula, String light, String water, Lilliputian k, String place){
        return Gerunds.HAVINGSETUP + " business with the " + light + ", " + k.getName() + " ran up to the "+ place + " and saw that here, too, an " + uvula.getName() + " was sticking out, demanding payment for " + water;
    }
    public String lickOff(Uvula uvula, String money, String place, String serviceName){
        return Gerunds.HAVINGLICKED + " a " + money + " in an instant, " + uvula.getName() + " disappeared into the " + place + " and the " + serviceName + " turned on";
    }
}
