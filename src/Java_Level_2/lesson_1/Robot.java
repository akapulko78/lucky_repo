package Java_Level_2.lesson_1;

public class Robot extends Team {

    private String name;
    private boolean onDistance;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;

    public Robot(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.onDistance = true;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " successfully run!");
        } else {
            System.out.println(name + " fail");
            onDistance = false;
        }
    }

    @Override
    public void jump(int distance) {
        if (distance <= maxJumpHeight) {
            System.out.println(name + " successfully jumped!");
        } else {
            System.out.println(name + " fail");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " can't swim");
            onDistance = false;
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " successfully swum!");
        } else {
            System.out.println(name + " fail");
            onDistance = false;
        }
    }

    @Override
    public String toString() {
        return name + ": " + (isOnDistance() ? "on distance" : "fail");
    }
}
