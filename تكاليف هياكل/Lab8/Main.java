public class Main {
    public static void main(String[] args) {
        Herbivores herbivore = new Herbivores("milk", "cat");
        herbivore.eat();

        Carnivorous carnivore = new Carnivorous("meat", "dog");
        carnivore.eat();
    }
}
