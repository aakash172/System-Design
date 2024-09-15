# Thread Safe Initialisation
* A simple way to create a thread-safe singleton class is to make the global access method synchronized so that only one thread can execute this method at a time. 

```java
public class ThreadSafeInitialisation {
    private ThreadSafeInitialisation(){};
    private static ThreadSafeInitialisation Instance;

    public static synchronized ThreadSafeInitialisation getInstance(){
        if(Instance==null)Instance=new ThreadSafeInitialisation();
        System.out.println("Get Instance");
        return Instance;
    }
}
```
* The preceding implementation works fine and provides thread-safety, but it reduces the performance because of the cost associated with the synchronized method, although we need it only for the first few threads that might create separate instances. To avoid this extra overhead every time, double-checked locking principle is used. In this approach, the synchronized block is used inside the if condition with an additional check to ensure that only one instance of a singleton class is created.
* The following code snippet provides the double-checked locking implementation:
```java
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
```
