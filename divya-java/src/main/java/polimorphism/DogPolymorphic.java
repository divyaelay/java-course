package polimorphism;

public class DogPolymorphic implements AnimalInterface {
    @Override
    public void sound() {
        System.out.println("Dog says: bow bow");
    }

    @Override
    public void noOfLegs() {
        System.out.println("Dog has four legs");
    }
}
