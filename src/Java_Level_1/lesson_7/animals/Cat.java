package Java_Level_1.lesson_7.animals;

import Java_Level_1.lesson_7.equipment.Plate;

import java.sql.SQLOutput;

public class Cat extends Animal {

    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private double maxJumpHeight;
    private boolean satiety = false;
    private double appetite;


    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int maxRunDistance, int maxSwimDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxSwimDistance, maxJumpHeight);
        this.maxSwimDistance = 0;
    }

    public Cat(String name) {
        this.name = name;
        this.maxRunDistance = 200;
        this.maxSwimDistance = 0;
        this.maxJumpHeight = 2;
        this.appetite = 5;
    }


    @Override
    public boolean run(int distance) {
        run(distance);
        return false;
    }

    @Override
    public boolean swim(int distance) {
        swim(distance);
        return false;
    }

    @Override
    public boolean jump(double height) {
        jump(height);
        return false;
    }
    public void eat(Plate plate) {
        if(isSatiety()){
            System.out.println(name + " already satiety");
        }
        else {
            if (plate.getAmountOfFood() < appetite) {
                System.out.println(name + " needs " +
                        (appetite - plate.getAmountOfFood()) + " pieces more");
                double necessaryFood = appetite - plate.getAmountOfFood();
                plate.giveMoreFood(necessaryFood);
                System.out.println("there is " + plate.getAmountOfFood() + " pieces now");
                plate.decreaseFood(appetite);
                setSatiety(true);
                System.out.println(name + " is not hungry more");
            }
            else {
                plate.decreaseFood(appetite);
                setSatiety(true);
                System.out.println(name + " is not hungry more");
            }
        }

    }


   /* @Override
    public boolean eat(Plate plate) {
        if (plate.getAmountOfFood() < appetite) {
            System.out.println(name + " " + isSatiety());
            return false;
        }
        plate.decreaseFood(appetite);
        setSatiety(true);
        System.out.println(name + " " + isSatiety());
        return true;
    }*/





    /*private String sounds;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
    public Cat() {
        this("cat","black", 2);
    }

    @Override
    public String getSound() {
        return null;
    }


    public String makeSomeNoize() {
        return sounds;
    }
    public String getSounds() {
        return sounds;
    }*/
}
