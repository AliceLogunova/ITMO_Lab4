package story;

import film.Film;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class ReflectionChecker {
    public ReflectionChecker(){}

    public void showFieldsAnnotations(Object object){
        Class cls = object.getClass();
        Field[] fields = cls.getDeclaredFields();
        for(Field field: fields){
            Annotation[] annotations = field.getAnnotations();
            for(Annotation annotation: annotations){
                System.out.println(field.getName() + ":" + annotation.toString());
            }
        }
    }

    public void showMethodsAnnotations(Object object){
        Class cls = object.getClass();
        Method[] methods = cls.getMethods();
        for(Method method: methods){
            Annotation[] annotations = method.getAnnotations();
            for(Annotation annotation: annotations){
                System.out.println(method.getName() + ":" + annotation.toString());
            }
        }
    }

    public void showClassName(Object object){
        Class cls = object.getClass();
        System.out.println(cls.getName());
    }

    public void showClassFields(Object object){
        Class cls = object.getClass();
        Field[] fields = cls.getDeclaredFields();
        for(Field field: fields){
            Type type = field.getType();
            System.out.println(field.getName());
        }
    }

    public void showClassMethods(Object object){
        Class cls = object.getClass();
        Method [] methods = cls.getMethods();
        for(Method method: methods){
            System.out.println(method.getName());
        }
    }
    public void fillPrivateFields(Object object) throws IllegalAccessException {
        Class cls = object.getClass();
        Field[] fields = cls.getDeclaredFields();
        for(Field field: fields){
            Annotation annotation = field.getAnnotation(Film.Aboba.class);
            if(annotation == null){
                continue;
            }
            field.setAccessible(true);
            field.set(object, "ФИЛЬМЕЦ");
            field.setAccessible(false);
        }
    }

    public Object createNewObject(Object object) throws InstantiationException, IllegalAccessException {
        Class cls = object.getClass();
        System.out.println("|||||");
        return cls.newInstance();
    }
}
