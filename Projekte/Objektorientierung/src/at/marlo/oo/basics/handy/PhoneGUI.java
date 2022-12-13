package at.marlo.oo.basics.handy;

import java.util.List;
import java.util.Scanner;

public class PhoneGUI {
    private Phone phone;

    public PhoneGUI(Phone phone) {
        this.phone = phone;
    }

    public void run() {
        System.out.println("Willkommen beim Super Samsung");


        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1 Call, 2 picture, 3 get free space, 4 get all Files");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    phone.doCall("12345678");
                    break;
                case 2:
                    phone.takePicture();
                    break;
                case 3:
                    System.out.println(phone.getFreeSpace());
                case 4:
                    List<PhoneFile> files = phone.getAllFiles();
                    for (PhoneFile file : files) {
                        System.out.println(file.getInfo());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
