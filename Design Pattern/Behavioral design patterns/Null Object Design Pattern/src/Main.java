public class Main {
    public static void main(String[] args) {
        Vehicle vehicle= VehicleFactory.getVehicleObject("Bike");
        System.out.println("SeatCapacity = "+vehicle.gettingSeatCapacity()+", TankCapacity = "+vehicle.fuelSeatCapacity());
    }
}