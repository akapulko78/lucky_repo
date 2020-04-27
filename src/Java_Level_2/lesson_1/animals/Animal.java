package Java_Level_2.lesson_1.animals;

import Java_Level_2.lesson_1.Team;

public abstract class Animal extends Team {
    private String name;
    private boolean onDistance;
    private int maxRunDistance;
    private int maxJumpHeight;
    private int maxSwimDistance;


    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String name, int maxRunDistance,
                  int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public String getName() {
        return name;
    }

    public abstract void makeVoice();

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
        return name + ": " + (isOnDistance() ? " on distance" : " fail");
    }
}
