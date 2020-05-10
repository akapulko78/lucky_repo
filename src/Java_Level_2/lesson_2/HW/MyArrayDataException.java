package Java_Level_2.lesson_2.HW;

import org.w3c.dom.ls.LSOutput;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(String value) {
        super("illegal value " + value);
    }
}
