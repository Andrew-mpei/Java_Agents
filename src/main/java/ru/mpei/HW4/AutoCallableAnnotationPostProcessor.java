package ru.mpei.HW4;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class AutoCallableAnnotationPostProcessor {
    public static void findAutoCallable() throws
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        Reflections r = new Reflections(Printer.class);

        Set<Class<? extends Printer>> types = r.getSubTypesOf(Printer.class);
        for (Class<? extends Printer> clazz : types){
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods){
                if (method != null && method.getAnnotation(AutoCallable.class) != null){
                    int counter = method.getAnnotation(AutoCallable.class).counter();
                    for (int i = 0; i < counter; i++){
                        if (method.isAnnotationPresent(AutoCallable.class)){
                            method.invoke(clazz.getDeclaredConstructor().newInstance());
                        }
                    }
                    System.out.println("counter = " + counter);
                }

            }
        }
    }
}
