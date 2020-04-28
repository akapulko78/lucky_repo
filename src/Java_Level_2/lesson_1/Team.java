package Java_Level_2.lesson_1;

public class Team {
    Participant[] participants;

    String name;

    public Team(Participant[] participants, String name) {
        this.participants = participants;
        this.name = name;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public String getName() {
        return name;
    }


    public void showResults() {
        for (Participant p : participants) {
            System.out.println(p);
        }
    }

    public void showInfo() {
        for (Participant p : participants) {

            System.out.println(p);
        }
    }
}
