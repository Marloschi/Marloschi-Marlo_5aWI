package at.marlo.oo.basics.handy;

import java.util.List;

public class Phone {
    private String color;
    private Camera camera;
    private SDCard sdCard;
    private Sim sim;

    public Phone(String color, Camera camera, SDCard sdCard, Sim sim) {
        this.color = color;
        this.camera = camera;
        this.sdCard = sdCard;
        this.sim = sim;
    }

    public void doCall(String number) {
        this.sim.doCall(number);
    }

    public void takePicture() {
        PhoneFile file = this.camera.takePicture();
        this.sdCard.save(file);
    }

    public List<PhoneFile> getAllFiles() {
        return this.sdCard.getFiles();

    }

    public int getFreeSpace() {
        return this.sdCard.getFreeSpace();
    }
}
