public class Main {
    public static void main(String[] args) {
        AnimalFactory obj= AnimalFactory.craeteAnimalFactory("Sea");
        IAnimal obj2=obj.getAnimal("Shark") ;
        System.out.println("Type : " + obj2.getType());
        System.out.println("Speak : " + obj2.speak());
    }
}