import EarlyIntialisation.EarlyInitialisation;
import LazyInitialisation.LazyInitialisation;
import SingletonEnum.SingletonEnum;
import ThreadSafeInitialisation.ThreadSafeInitialisation;
import ThreadSafeInitialisation.ThreadSafeOptimise;

public class Main {
    public static void main(String[] args) {
        EarlyInitialisation obj1=EarlyInitialisation.getInstance();
        LazyInitialisation obj2=LazyInitialisation.getInstance();
        ThreadSafeInitialisation obj3= ThreadSafeInitialisation.getInstance();
        ThreadSafeOptimise obj4= ThreadSafeOptimise.getInstance();

        //Enum
        SingletonEnum obj5=SingletonEnum.Instance;
        obj5.doSomething();
        SingletonEnum obj6=SingletonEnum.Instance;
        obj6.doSomething();

    }
}