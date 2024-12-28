import Strategy.Drivestrategy;

public class Vehicle {
    Drivestrategy driveObject;
    Vehicle(Drivestrategy driveObject){
        this.driveObject=driveObject;
    }
    public void drive(){
        driveObject.drive();
    }
}
