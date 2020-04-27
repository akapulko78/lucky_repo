package Java_Level_2.lesson_1.obstacles;

import Java_Level_2.lesson_1.Team;

public class Water extends Course {

    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Team[] team) {
        for (Team thisTeam : team) {
            thisTeam.swim(length);
        }
    }
}
