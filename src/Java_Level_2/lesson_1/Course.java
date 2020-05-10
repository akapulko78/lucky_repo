package Java_Level_2.lesson_1;

import Java_Level_2.lesson_1.obstacles.Obstacle;

public class Course {
   private Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Obstacle o : obstacles) {
            for (Participant p : team.getParticipants()) {
                o.doIt(p);
                /*if (!p.isOnDistance()){
                    break;
                }*/
            }
        }
    }
}
