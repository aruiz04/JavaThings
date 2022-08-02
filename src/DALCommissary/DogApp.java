package DALCommissary;

public class DogApp
{
    public static void main(String[] args) {
        IDog dog = new Dog();
        dog.Bark();
        dog.Seat();

        IDog pups = new Puppy();
        pups.Bark();
        pups.Seat();

    }
}
