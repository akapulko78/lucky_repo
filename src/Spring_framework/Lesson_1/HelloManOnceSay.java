package Spring_framework.Lesson_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class HelloManOnceSay implements HelloMan {
    private String name;

    public HelloManOnceSay(String name) {
        this.name = name;
    }

    @Override
    public void helloSay() {
        System.out.println("Hello" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
