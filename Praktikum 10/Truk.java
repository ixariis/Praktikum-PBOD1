public class Truk extends Vehicle {

    private double maxLoad;

    public Truk(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad * 1.5;
    }

    public double calcTripDistance(){
        return 1500.00;
    }

    @Override
    public String toString(){
        return "Truk adalah angkutan darat yang sangat handal";
    }
    
}
