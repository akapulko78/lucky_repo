package Java_Level_2.lesson_1.obstacles;

import Java_Level_2.lesson_1.Team;

public class Cross extends Course {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Team[] team) {
        for (Team thisTeam : team) {
            thisTeam.run(length);
        }
    }
}
