package Devices;
import Command.ICommand;

import java.util.Stack;

public class MyRemoteDevice {
    ICommand command;
     Stack<ICommand>history=new Stack<>();

   public void setCommand(ICommand command){
        this.command=command;
    }
   public void pressButton(){
        command.pressButton();
        history.push(command);
    }
   public void undo(){
        if(!history.empty()){
            ICommand lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
