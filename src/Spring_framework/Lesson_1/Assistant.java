package Spring_framework.Lesson_1;

public class Assistant {
    public CameraImp getCamera(){
        CameraImp cameraImp = new CameraImp();
        ICameraRoll cameraRoll = new ColorCameraRoll();
        cameraImp.setCameraRoll(cameraRoll);
        return cameraImp;
    }
}
