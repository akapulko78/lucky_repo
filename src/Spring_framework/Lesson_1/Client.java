package Spring_framework.Lesson_1;

public class Client {
    public static void main(String[] args) {
        /*Camera camera = new Camera();
        ICameraRoll cameraRoll = new ColorCameraRoll();
        camera.setCameraRoll(cameraRoll);*//*
        camera.doPhotograph();*/
        Assistant assistant = new Assistant();
        CameraImp cameraImp = assistant.getCamera();
        cameraImp.doPhotograph();
    }
}
