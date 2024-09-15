import EarlyIntialisation.EarlyInitialisation;
import LazyInitialisation.LazyInitialisation;

public class Main {
    public static void main(String[] args) {
        EarlyInitialisation obj1=EarlyInitialisation.getInstance();
        LazyInitialisation obj2=LazyInitialisation.getInstance();
    }
}