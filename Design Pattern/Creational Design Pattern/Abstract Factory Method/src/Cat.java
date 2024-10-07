public class Cat implements  IAnimal{

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public String speak() {
        return "Meow Meow";
    }
}
