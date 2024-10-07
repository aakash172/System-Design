public abstract class AnimalFactory {
    public abstract IAnimal getAnimal(String factoryType);
    public  static AnimalFactory craeteAnimalFactory(String animal){
        if(animal.equals("Sea")){
            return new SeaAnimalFactory();
        }else if(animal.equals("Land")){
            return new LandAnimalFactory();
        }
        System.out.println("Invalid");
        return null;
    }
}
