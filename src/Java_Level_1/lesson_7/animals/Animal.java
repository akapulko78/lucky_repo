package Java_Level_1.lesson_7.animals;

import Java_Level_1.lesson_7.equipment.Plate;

public abstract class Animal {
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected double maxJumpHeight;
    protected boolean satiety;
    protected double appetite;
    protected String name;

    public Animal(String name, int maxRunDistance, int maxSwimDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.satiety = false;
    }

    protected Animal() {
    }

    public double getAppetite() {
        return appetite;
    }

    public void setAppetite(double appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    protected abstract boolean run(int distance);

    protected abstract boolean swim(int distance);

    protected abstract boolean jump(double height);

    public abstract void eat(Plate plate);

    /*public boolean eat(Plate plate) {
        if (plate.getAmountOfFood() < appetite) {
            return false;
        }
        plate.decreaseFood(appetite);
        return true;
    }*/




    /*private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Animal() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getSound();*/
}
