package Java_Level_2.lesson_2.HW;

import org.w3c.dom.ls.LSOutput;

public class MyArrayDataException extends Exception {

    private String value;

    public MyArrayDataException(String value, Throwable cause) {
        super("illegal value " + value + ": " + cause);
    }

    public MyArrayDataException(String value) {
        this(value, null);
    }
}
