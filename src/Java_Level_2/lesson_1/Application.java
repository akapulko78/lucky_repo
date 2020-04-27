package Java_Level_2.lesson_1;

import Java_Level_2.lesson_1.Participant;
import Java_Level_2.lesson_1.animals.Cat;
import Java_Level_2.lesson_1.animals.Dog;
import Java_Level_2.lesson_1.obstacles.Cross;
import Java_Level_2.lesson_1.obstacles.Obstacle;
import Java_Level_2.lesson_1.obstacles.Wall;
import Java_Level_2.lesson_1.obstacles.Water;

public class Application {

    public static void main(String[] args) {
        Participant[] participants = new Participant[] {
                new Cat("Барсик", 10, 12, 0),
                new Dog("Дружок", 20, 5, 15),
                new Cat("Мурзик", 9, 14, 0),
                new Robot("Вертер", 50, 50, 50),
        };

        Obstacle[] obstacles = new Obstacle[] {
                new Cross(5),
                new Wall(3),
                new Water(7)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }

        System.out.println("Итоги:");
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }
}
