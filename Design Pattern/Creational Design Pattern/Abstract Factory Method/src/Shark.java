public class Shark implements IAnimal{

    @Override
    public String getType() {
        return "Shark";
    }

    @Override
    public String speak() {
        return "Can't Speak";
    }
}
