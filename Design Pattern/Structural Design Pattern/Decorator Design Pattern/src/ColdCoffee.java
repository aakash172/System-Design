public class ColdCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Cold Coffee";
    }

    @Override
    public double getCost() {
        return 20.0;
    }
}