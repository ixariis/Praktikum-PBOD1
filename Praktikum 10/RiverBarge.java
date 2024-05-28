public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad * 0.5;
    }

    public double calcTripDistance(){
        return 200.00;
    }
}
