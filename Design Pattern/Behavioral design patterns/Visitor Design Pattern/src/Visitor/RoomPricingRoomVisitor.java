package Visitor;

import Room.DeluxeRoom;
import Room.DoubleRoom;
import Room.SingleRoom;

public class RoomPricingRoomVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Price Computation logic for Single Room");
        singleRoomObj.price=1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Price Computation logic for Double Room");
        doubleRoomObj.price=2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj) {
        System.out.println("Price Computation logic for Deluxe Room");
        deluxeRoomObj.price=3000;
    }
}
