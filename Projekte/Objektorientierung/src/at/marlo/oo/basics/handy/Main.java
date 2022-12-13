package at.marlo.oo.basics.handy;

public class Main {
    public static void main(String[] args) {

        Sim sim = new Sim(1, "1234567");
        SDCard sdCard = new SDCard(100000);
        Camera cam = new Camera(1000);


        Phone phone = new Phone("blue", cam, sdCard, sim);
        phone.doCall("1111");
        phone.takePicture();
        phone.takePicture();

        
        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println(phone.getFreeSpace());

        PhoneGUI phoneGUI = new PhoneGUI(phone);
        phoneGUI.run();

    }
}
