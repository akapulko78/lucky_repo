package Java_Level_1.lesson_6;

public class Dog extends Animal {

    public Dog(int maxRunDistance, int maxSwimDistance, double maxJumpHeight) {
        super(maxRunDistance, maxSwimDistance, maxJumpHeight);
    }

    @Override
    public void run(int distance) {
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
    }

    @Override
    public void jump(double height) {
        super.jump(height);
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
