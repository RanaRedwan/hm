public class Animal {
    protected String foodType;

    public Animal(String foodType) {
        this.foodType = foodType;
    }

    public void eat() {
        System.out.println("I am eating " + foodType);
    }
}
