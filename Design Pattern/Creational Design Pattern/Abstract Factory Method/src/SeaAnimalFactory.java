public class SeaAnimalFactory extends AnimalFactory{

    @Override
    public IAnimal getAnimal(String animalType) {
        if(animalType.equals("Shark")){
            return new Shark();
        }else if(animalType.equals("Octapus")){
            return new Octopus();
        }else{
            System.out.println("This Animal is Not present");
            return null;
        }
    }
}
