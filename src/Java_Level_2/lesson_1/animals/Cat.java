package Java_Level_2.lesson_1.animals;

public class Cat extends Animal {
    private String name;

    public Cat(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void makeVoice() {
        System.out.println("mya");
    }
}
