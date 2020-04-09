package Java_Level_1.lesson_6;


public class Lesson_6 {
    public static void main(String[] args) {
        Animal dog1 = new Dog(500, 10, 0.5);
        Animal dog2 = new Dog(600, 10, 0.5);
        Animal cat = new Cat(200, 1, 2);

        dog1.jump(1);
        dog2.swim(10);
        cat.swim(1);
      /*  Dog dog = new Dog();
        Animal[] animals = new Animal[]{new Cat(), dog};
        for (Animal animal : animals) {
            System.out.format("Animal %s named %s make noize %s",
                    animal.getClass().getSimpleName(),
                    animal.getName(),
                    animal.getSound());
        }
        Animal animal = new Cat();
        System.out.println(animal.getSound());
        CanMove[] elements = new CanMove[]{(CanMove) animals[1], new Robot()};
        for (CanMove element : elements) {
            element.getDistance();
            element.move();
        }

        Robot robot = new Robot();*/
    }
}
