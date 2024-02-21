public class Car extends Vehicle{
    protected int seatsNumber;

    public Car(String model, int year, String fuelType, double speed, int seatsNumber) {
        super(model, year, fuelType, speed);
        this.seatsNumber = seatsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seats Number: " + seatsNumber);
    }

    @Override
    public double calculateDistanceTraveled(double time) {
        return super.calculateDistanceTraveled(time);
    }
}
