package room;

import alive.*;

public class Soap extends PremisesObject{
    public Soap(String obj, String place){
        super(obj, place);
    }

    @Override
    public String beInRoom(PremisesObject soap, String place){
        class InRoom{
            public String exist(Boolean existing){
                if (existing)
                    return soap.getName() + " layed on the ";
                else
                    return " blablabla ";
            }
        }
        InRoom inRoomCheck = new InRoom();
        return inRoomCheck.exist(Boolean.TRUE) + place;
    }

    public String hurt(Soap soap, Lilliputian lilliputian){
        return soap.getName() + " " + Adverb.UNBEARABLE + " stinged " + lilliputian.getFriendName() + "'s eyes, and there was nothing to wash off";
    }
}
