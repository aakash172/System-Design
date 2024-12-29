package Command;
import Devices.AirConditioner;

public class TurnACOffCommand implements ICommand{
    AirConditioner ac;

    public TurnACOffCommand(AirConditioner ac){
        this.ac=ac;
    }
    @Override
    public void pressButton() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
