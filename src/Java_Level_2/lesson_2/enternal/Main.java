package Java_Level_2.lesson_2.enternal;

public class Main {

    public class Internal {
        public int value;

    }

    public static void main(String[] args) {
        Internal internal = new Main().new Internal();
    }
}
