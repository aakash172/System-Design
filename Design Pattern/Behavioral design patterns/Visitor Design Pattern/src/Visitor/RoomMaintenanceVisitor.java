package Visitor;

import Room.DeluxeRoom;
import Room.DoubleRoom;
import Room.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Performing maintenance for single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Performing maintenance for Double Room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj) {
        System.out.println("Performing maintenance for Deluxe Room");
    }
}
