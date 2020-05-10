package Java_Level_2.lesson_2.enums;

public enum Colors {
    BLACK("черный"), WHITE("белый"), RED("крансый");
    public String ruName;

    Colors(String ruName) {
        this.ruName = ruName;
    }

    public String getRuName() {
        return ruName;
    }
}
