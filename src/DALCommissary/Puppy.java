package DALCommissary;

public class Puppy implements IDog {
    @Override
    public void Bark() {
        System.out.println("I'm little I dont bark as loud");
    }

    @Override
    public void Seat() {
        System.out.println("I'm always sitting down");
    }
}
