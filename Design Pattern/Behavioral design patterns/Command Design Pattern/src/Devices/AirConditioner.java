package Devices;

public class AirConditioner {
    boolean isOn;
    int temprature;
    public void turnOnAC(){
        isOn=true;
        System.out.println("AC is On");
    }

    public void turnOffAC(){
        isOn=false;
        System.out.println("AC is off");
    }
    public void setTemprature(int temprature){
        this.temprature=temprature;
        System.out.println("Temprature is set to "+temprature);
    }

}
