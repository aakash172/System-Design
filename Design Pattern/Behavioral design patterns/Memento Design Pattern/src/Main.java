public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker=new ConfigurationCareTaker();

        ConfigurationOriginator originatorObj = new ConfigurationOriginator(5,10);

        ConfigurationMemento ss1=originatorObj.createMemento();
        careTaker.addMemento(ss1);
        originatorObj.setHeight(58);
        originatorObj.setWidth(150);

        ConfigurationMemento ss2=originatorObj.createMemento();
        careTaker.addMemento(ss2);

        originatorObj.setHeight(16);
        originatorObj.setWidth(52);

        ConfigurationMemento restoreMemento=careTaker.undo();
        originatorObj.restoreMemento(restoreMemento);
        System.out.println("height: "+originatorObj.height +" \nWeight: "+originatorObj.width);
    }
}