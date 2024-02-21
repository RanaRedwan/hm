public class Product {
    private int id;
    private String description;
    private double cost;
    private double price;

    public Product(int id, String description, double cost, double price) {
        this.id = id;
        this.description = description;
        this.cost = cost;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }
}
