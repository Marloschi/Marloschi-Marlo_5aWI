package at.marlo.oo.basics.handy;

public class Camera {
    private int fileNumber = 0;
    private int resolution;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public PhoneFile takePicture() {
        PhoneFile file = new PhoneFile("jpg", resolution, "pic" + fileNumber);
        fileNumber++;
        return file;
    }


}
