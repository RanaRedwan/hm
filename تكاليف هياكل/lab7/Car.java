public class Car {
private int Id;
private  String Brand;
private String Model;
private Engine Engine;

    public Car(int id, String brand, String model, Engine engine) {
        Id = id;
        Brand = brand;
        Model = model;
        Engine = engine;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Engine getEngine() {
        return Engine;
    }

    public void setEngine(Engine engine) {
        Engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Engine=" + Engine +
                '}';
    }
}
