public class Carnivorous extends Animal{
    private String Carnivore;

    public Carnivorous(String foodType, String typeOfCarnivore) {
        super(foodType);
        this.Carnivore = typeOfCarnivore;
    }

    @Override
    public void eat() {
        System.out.println("I am  " + Carnivore + " and I am eating " + foodType);
    }
}
