package Spring_framework.Lesson_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
       /* Assistant assistant = new Assistant();
        CameraImp cameraImp = assistant.getCamera();
        cameraImp.doPhotograph();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring_framework/resources/config.xml");
        ICamera camera = context.getBean("camera",ICamera.class);
        camera.doPhotograph();
    }
}
