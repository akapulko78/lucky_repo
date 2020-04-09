package Spring_framework.Lesson_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
       /* Assistant assistant = new Assistant();
        CameraImp cameraImp = assistant.getCamera();
        cameraImp.doPhotograph();*/

      /*  ApplicationContext context = new ClassPathXmlApplicationContext("Spring_framework/resources/config.xml");
        ICamera camera = context.getBean("camera",ICamera.class);
        camera.doPhotograph();*/

        /*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ICamera camera = context.getBean("camera",ICamera.class);
        camera.doPhotograph();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring_framework/resources/config.xml");
        HelloMan helloMan = context.getBean("helloman",HelloMan.class);
        /*helloMan.setName("Yulia");*/
        helloMan.helloSay();
    }
}
