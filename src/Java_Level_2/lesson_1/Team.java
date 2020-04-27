package Java_Level_2.lesson_1;

public class Team {
    String teamName;
    Team[] team;


    public Team(String teamName, Team dog, Team cat,
                Team cat1, Team robot) {
        this.teamName = teamName;
        team = new Team[4];
        team[0] = dog;
        team[1] = cat;
        team[2] = cat1;
        team[3] = robot;
    }

    protected Team() {
    }

    public Team[] getTeam() {
        return team;
    }

    /*boolean isOnDistance();

    public void run(int distance);

    public void jump(int distance);

    public void swim(int distance);*/

    public void membersOnDistance() {
        for (Team member : team) {
            if (member.) {
                System.out.println(member);
            }
        }
    }

    public void teamInfo() {
        for (Team member : team) {
            System.out.println(member);
        }
    }

}
