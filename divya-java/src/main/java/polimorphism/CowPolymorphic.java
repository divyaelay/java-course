package polimorphism;

public class CowPolymorphic implements AnimalInterface {
    @Override
    public void sound() {
        System.out.println("Cow says: ma ma ");
    }

    @Override
    public void noOfLegs() {
        System.out.println("Cow has four legs ");
    }
}
