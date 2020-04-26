package Java_Level_1.lesson_7.animals;

import Java_Level_1.lesson_7.equipment.Plate;

public class Dog extends Animal {

    public Dog(String name, int maxRunDistance, int maxSwimDistance, double maxJumpHeight) {
        super(name,maxRunDistance, maxSwimDistance, maxJumpHeight);
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

    @Override
    public void eat(Plate plate) {

    }

    /*private long distance;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public Dog() {
        this("dog", "brown", 3);
    }

    @Override
    public long getDistance() {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("goes to " + distance);
    }

    @Override
    public String getSound() {
        return "gaw";
    }*/
}
