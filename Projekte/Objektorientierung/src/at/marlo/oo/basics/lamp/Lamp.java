package at.marlo.oo.basics.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {

    private String color;
    private List<LightElement> lightElement;


    public Lamp(String color) {
        this.color = color;
        this.lightElement = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public List<LightElement> getLightElement() {
        return lightElement;
    }

    public void setLightElement() {
        this.lightElement = lightElement;
    }


    public void addLightElement(LightElement lightElement) {
        this.lightElement.add(lightElement);
    }


    public void printNamesOfLightElements() {
        for (LightElement lightElement : this.lightElement
        ) {


            System.out.println(lightElement.getName());
        }
    }

    public void turnAllOn() {

        for (LightElement lightElement : this.lightElement
        ) {
            if (lightElement.getStatus() == true) {
                System.out.println(lightElement.getName() + " ist schon eingeschaltet");
            } else {
                lightElement.setStatus(true);
                lightElement.setPowerUsage(lightElement.getPowerUsage() + 5);
                System.out.println(lightElement.getName() + " Eingeschalten");
            }

        }
    }

    public double getOverallPowerUsage() {
        double x = 0;
        for (LightElement lightElement : this.lightElement
        ) {
            x += lightElement.getPowerUsage();
        }
        return x;
    }


}


