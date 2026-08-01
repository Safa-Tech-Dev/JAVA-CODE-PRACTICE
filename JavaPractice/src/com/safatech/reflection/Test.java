package JavaPractice.src.com.safatech.reflection;

import java.lang.reflect.*;

public class Test {

    static void main() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        Class eagleClass = Eagle.class;

//        Method[] methods = eagleClass.getMethods();
//        Method[] declaredMethods = eagleClass.getDeclaredMethods();
//
//        for(Method method : declaredMethods){
//
//            IO.println("Method Name " + method.getName());
//        }
//        for(Method method : methods){
//
//            IO.println("Method Name " + method.getName());
//            IO.println("Return Type " + method.getReturnType());
//            IO.println("class Name " + method.getDeclaringClass());
//            IO.println("-----------------------------------------");
//
//
////            IO.println("Modifier " + Modifier.toString(eagleClass.getModifiers()));
//
//        }

        // Method Reflection
//        Object eagleObject = eagleClass.newInstance();
//        Method flyMethod = eagleClass.getMethod("fly", int.class, boolean.class, String.class);
//        flyMethod.invoke(eagleObject, 1, true, "Hello");

        // Field Reflection
        // Get Public field
//        Field[] fields = eagleClass.getFields();
//        for(Field field : fields){
//
//            IO.println("Field Name: " + field.getName());
//            IO.println("Field Type: " + field.getType());
//            IO.println("Field Modifier: " + Modifier.toString(field.getModifiers()));
//        }
        // Field Reflection
        // Get Public & Private fields
       /* Field[] fields = eagleClass.getDeclaredFields();
        for(Field field : fields){

            IO.println("Field Name: " + field.getName());
            IO.println("Field Type: " + field.getType());
            IO.println("Field Modifier: " + Modifier.toString(field.getModifiers()));
        }*/

        // Setting the value of public Field
       /* Eagle eagle = new Eagle();
        Field breed = eagleClass.getField("breed");
        breed.set(eagle, "eageBrownBread");
        IO.println(eagle.breed);
        */

        // Setting the value of private Field - Incorrect way
       /* Eagle eagle = new Eagle();
        Field breed = eagleClass.getDeclaredField("canSwim");
        breed.set(eagle, true);
        IO.println(eagle.canSwim); */


        // Setting the value of private Field - correct way
       /* Eagle eagle = new Eagle();
        Field canSwim = eagleClass.getDeclaredField("canSwim");
        canSwim.setAccessible(true);
        canSwim.set(eagle, true);
        if(canSwim.getBoolean(eagle)){
            IO.println("Value is set to true");
        }*/

        // Reflection of Constructor

        Constructor[] declaredConstructorList = eagleClass.getDeclaredConstructors();
        for(Constructor constructor : declaredConstructorList){

            IO.println("Modifier: " + Modifier.toString(constructor.getModifiers()));

            constructor.setAccessible(true);
            Eagle eagle = (Eagle) constructor.newInstance();
            eagle.fly();
        }


    }
}
