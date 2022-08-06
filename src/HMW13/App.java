package HMW13;

public class App {
    public static void main(String[] args) {
        System.out.println("for String");
        GenericMap<String> hello = new GenericMap<String>("1");
        hello.Put("2", "Hello Again");
        hello.Print();
        System.out.println("for integer");
        GenericMap<Integer> myInteger = new GenericMap<Integer>(0);
        myInteger.Put(1, 23);
        myInteger.Print();
    }
}

