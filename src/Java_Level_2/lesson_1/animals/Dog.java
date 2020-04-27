package Java_Level_2.lesson_1.animals;

public class Dog extends Animal {

    public Dog(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void makeVoice() {
        System.out.println("gaw");
    }

    public void swim() {
        System.out.println(getName() + " swim");
    }
}
