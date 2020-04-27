package Java_Level_2.lesson_1;

import Java_Level_2.lesson_1.animals.Cat;
import Java_Level_2.lesson_1.animals.Dog;
import Java_Level_2.lesson_1.obstacles.Cross;
import Java_Level_2.lesson_1.obstacles.Course;
import Java_Level_2.lesson_1.obstacles.Wall;
import Java_Level_2.lesson_1.obstacles.Water;

public class Application {
    public static void main(String[] args) {
        Team team_1 = new Team{
                new Cat("Tom", 10, 12, 0),
                new Dog("Bark", 20, 5, 15),
                new Robot("Diego", 50, 50, 50)
        };
        Course course_1 = new Course();
        course_1.doIt(team_1);
    }
}
