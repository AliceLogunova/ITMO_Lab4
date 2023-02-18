package room;

import alive.Lilliputian;

public abstract class PremisesObject {
    protected String obj;
    protected String place;

    public abstract String beInRoom(PremisesObject x, String place);

    public PremisesObject(String obj, String place) {
        this.obj = obj;
        this.place = place;
    }

    public String getName() {
        return this.obj;
    }

}
