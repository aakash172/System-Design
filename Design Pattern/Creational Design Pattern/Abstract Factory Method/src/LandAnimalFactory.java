public class LandAnimalFactory extends AnimalFactory{
    @Override
    public IAnimal getAnimal(String animalType) {
        if(animalType.equals("Cat")){
            return new Cat();
        }else if(animalType.equals("Dog")){
            return new Dog();
        }else{
            System.out.println("This animal doesnot exit");
            return  null;
        }
    }
}
