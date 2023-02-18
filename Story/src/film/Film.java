package film;

import alive.Adverb;

import java.lang.annotation.*;

public class Film {
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Aboba {
        public String language = "russian";
    }
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Keka {}

    @Aboba
    private String name;

    public Film(String name){
        this.name = name;
    }

    @Keka
    public String getName(){
        return name;
    }
    public String developments(Film name){
        return "The " + name.getName() + ", meanwhile, became more intense and more rapid.";
    }
    public String essence(){
        return "One " + Adverb.AFTER + " another there were dizzying chases, mass brawls and deafening firefights.";
    }
}
