package at.marlo.oo.basics.car;

public class Tank {

    private int currentFuelAmount;
    private int tankSize;


    public Tank(int tankSize){
        this.tankSize = tankSize;

    }

    public int getTankSize() {
        return tankSize;
    }

    public int getCurrentFuelAmount() {
        return currentFuelAmount;
    }

    public void setCurrentFuelAmount(int currentFuelAmount) {
        this.currentFuelAmount = currentFuelAmount;
    }
}



