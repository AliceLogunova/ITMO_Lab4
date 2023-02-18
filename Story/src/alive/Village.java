package alive;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.*;
//////параметризированный класс

public class Village<T> {

    private List<String> citizensNames = new ArrayList();
    private String name;
    private Class<T> type;

    public Village(String name, Class<T> type){
        this.type = type;
        this.name = name;
        System.out.println("Village " + this.name + " initialized.");
    }
    //////инфа о типе дженерика
    public Class<T> getMyType() {
        return this.type;
    }

    public void put(T object){
        //////чучуть рефлексии, добываем инфу типа Class
        Class cls = object.getClass();
        if (object.getClass() == Dunno.class) {
            System.out.println("Wow! It's NEZNAYKA (Dunno)! Finally!");
        } else if (cls == Goat.class) {
            Goat goat = (Goat) object;
            goat.account.addCoin();
            System.out.println("Kozlik has given one more coin for entering the village.");
        }

        String name = ((Lilliputian)object).getName();
        this.citizensNames.add(name);
        System.out.println(name + " has been added to " + this.name);
    }
}
