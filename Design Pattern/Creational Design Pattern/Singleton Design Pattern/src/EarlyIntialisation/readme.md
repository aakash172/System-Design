# Early initialization
* In eager initialization, the instance of the singleton class is created at the time of class loading. 
* The drawback to eager initialization is that the method is created even though the client application might not be using it.
* Not thread safe.
#### Code:
```java
public class EarlyInitialisation {
    //Make Constructor private so no able to instantiate it from outside of class
    private  EarlyInitialisation(){}
    private static EarlyInitialisation Instance= new EarlyInitialisation();
    public  static EarlyInitialisation getInstance(){
        System.out.println("Get instance");
        return Instance;
    }
}
```