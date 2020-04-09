package Java_Level_1.lesson_6;

public class Cat extends Animal {

    public Cat(int maxRunDistance, int maxSwimDistance, double maxJumpHeight) {
        super(maxRunDistance, maxSwimDistance, maxJumpHeight);
        if (this.maxSwimDistance != 0){
            System.out.println("Cats can't swim");
            this.maxSwimDistance = 0;
        }
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
