package Room;

import Visitor.RoomVisitor;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}
