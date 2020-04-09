package Java_Level_1.lesson_6;

public abstract class Animal {
    int maxRunDistance;
    int maxSwimDistance;
    double maxJumpHeight;

    public Animal(int maxRunDistance, int maxSwimDistance, double maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(int distance) {
        System.out.println(distance <= maxRunDistance);
    }

    public void swim(int distance) {
        System.out.println(distance <= maxSwimDistance);
    }

    public void jump(double height) {
        System.out.println(height <= maxJumpHeight);
    }



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
