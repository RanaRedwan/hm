public class Truck extends Vehicle {

    protected double cargoCapacity;

    public Truck(String model, int year, String fuelType, double speed, double cargoCapacity) {
        super(model, year, fuelType, speed);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }

    @Override
    public double calculateDistanceTraveled(double time) {
        return super.calculateDistanceTraveled(time);
    }
}
