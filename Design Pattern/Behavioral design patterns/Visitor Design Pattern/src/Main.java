import Room.DeluxeRoom;
import Room.DoubleRoom;
import Room.RoomElement;
import Room.SingleRoom;
import Visitor.RoomMaintenanceVisitor;
import Visitor.RoomPricingRoomVisitor;
import Visitor.RoomVisitor;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoomobj = new SingleRoom();
        RoomElement doubleRoomobj = new DoubleRoom();
        RoomElement deluxeRoomobj = new DeluxeRoom();

        //performing an operation on the objects

        RoomVisitor pricingRoomVisitor = new RoomPricingRoomVisitor();

        singleRoomobj.accept(pricingRoomVisitor);
        System.out.println("Price for single room = "+((SingleRoom) singleRoomobj).price);

        doubleRoomobj.accept(pricingRoomVisitor);
        System.out.println("Price for Double room = "+((DoubleRoom) doubleRoomobj).price);

        deluxeRoomobj.accept(pricingRoomVisitor);
        System.out.println("Price for Deluxe room = "+((DeluxeRoom) deluxeRoomobj).price);

        RoomVisitor maintainanceVisitor = new RoomMaintenanceVisitor();
        singleRoomobj.accept(maintainanceVisitor);
        doubleRoomobj.accept(maintainanceVisitor);
        deluxeRoomobj.accept(maintainanceVisitor);
    }
}