package room;

import alive.Adverb;

public class RedEye extends PremisesObject{
    public RedEye(String obj, String place){
        super(obj, place);
    }

    @Override
    public String beInRoom(PremisesObject redEye, String place){
        class InRoom{
            public String exist(Boolean existing){
                if (existing)
                    return " hanging on the ";
                else
                    return " doesn't hanging on the ";
            }
        }
        InRoom inRoomCheck = new InRoom();
        return inRoomCheck.exist(Boolean.TRUE) + place;
    }
    public String shine(RedEye redEye){
        return "The only thing that could be seen in the darkness was the " + Adverb.PERSISTENTLY + " blinking " + redEye.getName();
    }
}
