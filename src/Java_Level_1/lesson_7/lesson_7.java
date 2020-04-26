package Java_Level_1.lesson_7;

import Java_Level_1.lesson_7.animals.Animal;
import Java_Level_1.lesson_7.animals.Cat;
import Java_Level_1.lesson_7.equipment.Plate;

public class lesson_7 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Anoshka"), new Cat("Boris"), new Cat("Tom")};
        Plate plate = new Plate(13);

        for (Cat cat : cats) {
            cat.eat(plate);
        }







       /* String name = "Daniil";
        System.out.println(name.contains("D"));
        System.out.println(name.startsWith("d"));
        System.out.println(name.toUpperCase());
        *//*StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("love");
        stringBuilder.toString();*//*
        long now = System.currentTimeMillis();
        String value = "";
        for (int i = 0; i < 10000; i++) {
            value += i;
        }

        System.out.println("time = " + (System.currentTimeMillis() - now) + " " + value.length());
        now = System.currentTimeMillis();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            stringBuilder1.append(i);
        }
        System.out.println("time = " + (System.currentTimeMillis() - now) + " " +
                stringBuilder1.toString().length());*/
    }
}
