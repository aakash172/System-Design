package ThreadSafeInitialisation;

public class ThreadSafeOptimise {
    private  ThreadSafeOptimise(){}

    private static ThreadSafeOptimise Instance=null;

    public static ThreadSafeOptimise getInstance(){
        if(Instance==null){
         synchronized (ThreadSafeOptimise.class){
             if(Instance==null){
                 Instance = new ThreadSafeOptimise();
             }
         }
        }
        System.out.println("Get Instance");
        return Instance;
    }
}
