package Java_Level_2.lesson_1.obstacles;

import Java_Level_2.lesson_1.Team;

public class Wall extends Course{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Team[] team) {
        for (Team thisTeam : team) {
            thisTeam.jump(height);
        }
    }

}
