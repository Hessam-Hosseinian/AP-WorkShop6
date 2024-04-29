public class Cheetah extends Mammal implements Hunter {

    public Cheetah(String animalName, int old, String abilities, int runningVelocity) {
        super(animalName, old, abilities, runningVelocity);
    }

    @Override
    public void hunt(Prey prey) {

        System.out.println(animalName + " hunted " + prey.getName());
        Cage.removeAnimal(prey);
    }
    

}