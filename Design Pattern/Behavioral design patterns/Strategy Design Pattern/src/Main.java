public class Main {
    public static void main(String[] args) {
        Vehicle normalVehicle= new NormalVechicle();
        normalVehicle.drive();

        Vehicle sportVehicle= new SportVehicle();
        sportVehicle.drive();

        Vehicle offVehicle= new OffroadVehicle();
        offVehicle.drive();

    }
}