import Strategy.NormalDriveStrategy;

public class NormalVechicle extends Vehicle{
    NormalVechicle(){
        super(new NormalDriveStrategy());
    }
}
