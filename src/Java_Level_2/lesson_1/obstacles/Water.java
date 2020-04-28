package Java_Level_2.lesson_1.obstacles;

import Java_Level_2.lesson_1.Participant;
public class Water extends Obstacle {

    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(length);
    }
}
