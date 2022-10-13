/*
 * @author kubilaycakmak
 * @date Oct 13, 2022
 * @version 1.0
 */
 
public class Vehicle {

    private String name;
    private String engine;
    private String fuelTank;
    private static String name2;

    Vehicle(){}
    
    Vehicle(String name, String engine, String fuelTank){
        this.name = name;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    // Member inner class
    class VehiclePart{
        private String partName;
        private String partPrice;

        VehiclePart(){
            this.partName = "Engine";
            this.partPrice = "50000CAD";
        }

        VehiclePart(String partName, String partPrice){
            this.partName = partName;
            this.partPrice = partPrice;
        }

        public String getPartName() {
            return partName;
        }

        public void setPartName(String partName) {
            this.partName = partName;
        }

        public String getPartPrice() {
            return partPrice;
        }

        public void setPartPrice(String partPrice) {
            this.partPrice = partPrice;
        }
    }

    VehiclePart vehiclePart = new VehiclePart();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(String fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public String toString() {
        return "Vehicle [name=" + name + ", engine=" + engine + ", fuelTank=" + fuelTank + "]";
    }


}
