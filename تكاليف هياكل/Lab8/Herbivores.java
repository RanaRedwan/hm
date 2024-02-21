public class Herbivores extends Animal{
    private String Herbivore;

    public Herbivores(String foodType, String typeOfHerbivore) {
        super(foodType);
        this.Herbivore = typeOfHerbivore;
    }

    @Override
    public void eat() {
        System.out.println("I am a " + Herbivore + " and I am eating " + foodType);
    }
}
