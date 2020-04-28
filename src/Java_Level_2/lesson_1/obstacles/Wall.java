package Java_Level_2.lesson_1.obstacles;

import Java_Level_2.lesson_1.Participant;


public class Wall extends Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
