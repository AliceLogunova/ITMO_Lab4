package story;

import alive.*;
import notLilliputian.*;
import room.*;
import film.*;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        //////вложенный статический класс
        class CommunalServices{
            public CommunalServices(){}

            static class Light {
                public final String serviceName;
                public Light(String serviceName) {
                    this.serviceName = serviceName;
                }
                public String turnOn(String light) {
                    return "The " + light + " turned on and all room became bright";}
                public String turnOff(String light) {
                    return ", but just at this time the " + light + " turned off and the room plunged into darkness again";}
            }

            static class Water{
                public final String serviceName;
                public Water(String serviceName) {
                    this.serviceName = serviceName;
                }
                public String turnOn(String water) {
                    return "The " + water + " was on";
                }
                public String turnOff(String water) {
                    return "But as soon as he lathered his face, something clicked and " + water + " turned off";}
            }
        }
        //////
        Village<Lilliputian> village = new Village("Flower town", Lilliputian.class);
        Goat goat = new Goat("Kozlik", "Neznayka", 666, 666, 10);
        Dunno dunno = new Dunno("Neznayka", "Kozlik", 333, 342);
//        dunno.say("kakaha");
//        dunno.say(45);
        village.put(dunno);
        village.put(goat);
        System.out.println(village.getMyType());

        BossOfBandits bossOfBandits = new BossOfBandits("Boss of bandits", "Bandits", "values");
        OtherBandits otherBandits = new OtherBandits("Boss of bandits", "Bandits", "values");
        Cops cops = new Cops("Cops");
        Screen screen = new Screen("screen", "tv");
        Film film = new Film("Film");
        CommunalServices.Light light = new CommunalServices.Light("light");
        CommunalServices.Water water = new CommunalServices.Water("water");
        RedEye redEye = new RedEye("red eye", "wall");
        Soap soap = new Soap("soap", "sink");
        Uvula uvula = new Uvula("uvula", "wall");
        //////анонимный класс
        interface IKnowTheTruth {
            void knowTheTruth();
        }
        IKnowTheTruth knowTheTruth = new IKnowTheTruth() {
            @Override
            public void knowTheTruth() {
                System.out.println("They still wanted to find out for some reason. At the same time, they were " + Adverb.EXTREMELY + " interested to know whether the bandits would eventually be caught or not.");
            }
        };
        //////
        System.out.println(dunno.watchFilm(goat, dunno) + otherBandits.steal(otherBandits, "values"));
        knowTheTruth.knowTheTruth();
        System.out.println(film.developments(film));
        System.out.println(film.essence());
        System.out.println(cops.hook(bossOfBandits,cops) + screen.turnOff(screen));
        System.out.println(screen.glich(screen) + bossOfBandits.help(bossOfBandits, otherBandits));
        System.out.println(cops.attack(otherBandits,cops) + cops.askForHelp(cops, "vehicles") + cops.chase(otherBandits, cops));
        System.out.println(dunno.stopWatchingFilm(dunno, goat));
        System.out.println(goat.stopEverything(uvula) + goat.decideToWash(soap, goat, "santik", "towel"));
        //////
        System.out.println(dunno.wash(dunno, goat));
        System.out.println(water.turnOff("water"));
        System.out.println(dunno.moveHands(dunno));
        System.out.println(soap.hurt(soap, dunno));
        System.out.println(dunno.askForHelp(dunno, goat));
        System.out.println(goat.walk(goat, "sink") + light.turnOff("light"));
        System.out.println(redEye.shine(redEye) + redEye.beInRoom(redEye,"wall") + uvula.beInRoom(uvula, "under it"));
        System.out.println(goat.pay(goat, "light", "santik"));
        System.out.println(uvula.lickOff(uvula, "santik", "wall", "light"));
        System.out.println(goat.pay(goat, "light", "santik"));
        System.out.println(uvula.leanOut(uvula, "light", "water", goat, "sink"));

        //////
        ReflectionChecker a = new ReflectionChecker();
        a.showFieldsAnnotations(film);
        a.showClassName(film);
        a.showClassFields(film);
        a.showClassMethods(film);
        a.showMethodsAnnotations(film);
        a.fillPrivateFields(film);
        System.out.println(film.getName());
        //////

    }
}