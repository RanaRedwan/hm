public class Vehicle {


        protected String model;
        protected int year;
        protected String fuelType;
        protected double speed;

        public Vehicle(String model, int year, String fuelType, double speed) {
            this.model = model;
            this.year = year;
            this.fuelType = fuelType;
            this.speed = speed;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public void displayDetails() {
            System.out.println("Vehicle Details:");
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Speed: " + speed + " k/h");
        }

        public double calculateDistanceTraveled(double time) {
            double distance = speed * time;
            return distance;
        }
    }

