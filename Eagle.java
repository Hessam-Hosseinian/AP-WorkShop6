public class Eagle extends Bird implements Hunter {

    public Eagle(String animalName, int old, String abilities, int flyHeight) {
        super(animalName, old, abilities, flyHeight);
    }

    @Override
    public void hunt(Prey prey) {

        System.out.println(animalName + " hunted " + prey.getName());
        Cage.removeAnimal(prey);

    }

    
}
