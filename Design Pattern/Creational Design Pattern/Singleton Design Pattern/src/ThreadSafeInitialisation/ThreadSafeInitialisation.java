package ThreadSafeInitialisation;

public class ThreadSafeInitialisation {
    private ThreadSafeInitialisation(){};
    private static ThreadSafeInitialisation Instance;

    public static synchronized ThreadSafeInitialisation getInstance(){
        if(Instance==null)Instance=new ThreadSafeInitialisation();
        System.out.println("Get Instance");
        return Instance;
    }
}
