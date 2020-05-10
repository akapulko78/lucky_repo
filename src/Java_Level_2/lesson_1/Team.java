package Java_Level_2.lesson_1;

public class Team {
    private final Participant[] participants;

    private final String name;

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
        System.out.println("Results: ");
        for (Participant p : participants) {
            System.out.println(p + (p.isOnDistance() ? " на дистанции" : " сошел с дистанции"));
        }
    }

    public void showInfo() {
        System.out.println("Team " + name + " contains:");
        for (Participant p : participants) {
            System.out.println(p);
        }
    }
}
