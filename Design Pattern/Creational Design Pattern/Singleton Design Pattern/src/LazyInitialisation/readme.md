# Lazy initialization
* Lazy initialization method to implement the singleton pattern creates the instance in the global access method.
* Not thread safe.
#### Code :
```java
public class LazyInitialisation {
    //Make Constructor private so no able to instantiate it from outside of class
    private  LazyInitialisation(){}
    private static LazyInitialisation Instance = null;
    public  static LazyInitialisation getInstance(){
        System.out.println("Get instance");
        if(Instance==null)Instance=new LazyInitialisation();
        return Instance;
    }
}
```