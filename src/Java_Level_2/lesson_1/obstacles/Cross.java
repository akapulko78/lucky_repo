package Java_Level_2.lesson_1.obstacles;

import Java_Level_2.lesson_1.Participant;

public class Cross extends Obstacle {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}
