package Command;
import Devices.AirConditioner;

public class TurnACOnCommand implements ICommand{
    AirConditioner ac;

    public TurnACOnCommand(AirConditioner ac){
        this.ac=ac;
    }
    @Override
    public void pressButton() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
