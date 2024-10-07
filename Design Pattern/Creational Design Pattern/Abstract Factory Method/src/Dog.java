public class Dog implements IAnimal{
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String speak() {
        return "Bark";
    }
}
