public class Dog extends LivingThings{
    Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
            breatheImplementor.breathe();
    }
}
