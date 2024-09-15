import EarlyIntialisation.EarlyInitialisation;
import LazyInitialisation.LazyInitialisation;
import ThreadSafeInitialisation.ThreadSafeInitialisation;
import ThreadSafeInitialisation.ThreadSafeOptimise;

public class Main {
    public static void main(String[] args) {
        EarlyInitialisation obj1=EarlyInitialisation.getInstance();
        LazyInitialisation obj2=LazyInitialisation.getInstance();
        ThreadSafeInitialisation obj3= ThreadSafeInitialisation.getInstance();
        ThreadSafeOptimise obj4= ThreadSafeOptimise.getInstance();
    }
}