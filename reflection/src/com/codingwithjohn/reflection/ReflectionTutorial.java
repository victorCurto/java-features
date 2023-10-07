package com.codingwithjohn.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTutorial {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Stella", 6);
        //System.out.println("My cat name: "+ myCat.getName());
        //myCat.name = "Fred";

/*        Field[] catFields = myCat.getClass().getDeclaredFields();

        for(Field field: catFields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat, "Jimml McGill");
            }
            //System.out.println(field.getName());
        }
        System.out.println("My cat name: "+ myCat.getName());*/


/*        // Convert the array to a stream and use forEach to print field details
        Arrays.stream(catFields).filter(field -> field.getName().equals("name")).map(field -> {
            field.setAccessible(true);
            try {
                field.set(myCat, "Bob");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
            return field;
            }).forEach(field -> {
                System.out.println("Field Name: " + field.getName());
                System.out.println("Field Type: " + field.getType());
                System.out.println("Modifiers: " + field.getModifiers());
                System.out.println("------------------------");
            });
        System.out.println("My cat name: "+ myCat.getName());*/


        Method[] catMethod = myCat.getClass().getDeclaredMethods();
        for(Method method: catMethod){
            if(method.getName().equals("thisIsAPrivateStaticMethod")){
                method.setAccessible( true);
                method.invoke(null);
            }
//            System.out.println(method.getName());
        }
    }
}