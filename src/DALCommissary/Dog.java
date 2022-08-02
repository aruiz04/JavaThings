package DALCommissary;

public class Dog implements IDog{
    @Override
    public void Bark() {
        System.out.println("arf arf");
    }

    @Override
    public void Seat() {
        System.out.println("OK I will sit");
    }
}

