import Command.TurnACOffCommand;
import Command.TurnACOnCommand;
import Devices.AirConditioner;
import Devices.MyRemoteDevice;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner=new AirConditioner();
        MyRemoteDevice remote=new MyRemoteDevice();

        remote.setCommand(new TurnACOnCommand(airConditioner));
        remote.pressButton();

        airConditioner.setTemprature(25);

        remote.setCommand(new TurnACOffCommand(airConditioner));
        remote.pressButton();;

        remote.undo();
    }
}