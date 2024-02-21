public class Invoice {
    private int id;
    private int date;
    private Product[] products;
    private int numberOfProducts;

    public Invoice(int id, int date, Product[] products, int numberOfProducts) {
        this.id = id;
        this.date = date;
        this.products = products;
        this.numberOfProducts = numberOfProducts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void displayDetails() {
        System.out.println("Invoice ID: " + getId());
        System.out.println("Date: " + getDate());
        System.out.println("Number of Products: " + getNumberOfProducts());
        System.out.println("Product:");

        }
    }

