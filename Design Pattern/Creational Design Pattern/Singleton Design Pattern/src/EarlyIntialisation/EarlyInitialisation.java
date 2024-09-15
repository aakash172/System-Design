package EarlyIntialisation;

public class EarlyInitialisation {
    //Make Constructor private so no able to instantiate it from outside of class
    private  EarlyInitialisation(){}
    private static EarlyInitialisation Instance= new EarlyInitialisation();
    public  static EarlyInitialisation getInstance(){
        System.out.println("Get instance");
        return Instance;
    }
}
