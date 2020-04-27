package Java_Level_2.lesson_1.obstacles;

import Java_Level_2.lesson_1.Team;

public class Course {

    Course[] course;

    public Course(Course[] course) {
        this.course = course;
    }

    public Course(Cross cross, Wall wall, Water water) {
        course = new Course[3];
        course[0] = cross;
        course[1] = wall;
        course[2] = water;
    }

    protected Course() {
    }

    public void doIt(Team[] team){
        for (Course c : course) {
            c.doIt(team);
        }
    }

}
