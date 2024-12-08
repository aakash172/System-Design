public class Main {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: ₹" + coffee.getCost());

        // PlainCoffee with Milk
        Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
        System.out.println("\nDescription: " + milkCoffee.getDescription());
        System.out.println("Cost: ₹" + milkCoffee.getCost());

        // PlainCoffee with Sugar and Milk
        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("\nDescription: " + sugarMilkCoffee.getDescription());
        System.out.println("Cost: ₹" + sugarMilkCoffee.getCost());

        // Cold coffee with Sugar and Milk
        Coffee sugarMilkColdCoffee = new SugarDecorator(new MilkDecorator(new ColdCoffee()));
        System.out.println("\nDescription: " + sugarMilkColdCoffee.getDescription());
        System.out.println("Cost: ₹" + sugarMilkColdCoffee.getCost());
    }
}