public class Main {
    public static void main(String[] args) {
       LivingThings dog=new Dog(new LandBreatheImplementor());
       dog.breatheProcess();

        LivingThings tree=new Banana(new TreeBreatheImplementor());
        tree.breatheProcess();

        LivingThings fish=new Fish(new WaterBreatheImplementor());
        fish.breatheProcess();
    }
}