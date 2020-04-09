package Spring_framework.Lesson_1;


import org.springframework.stereotype.Component;

@Component("cameraRoll")
public class ColorCameraRoll implements ICameraRoll  {
    @Override
    public void processing() {
        System.out.println("-1 color frame");
    }
}
