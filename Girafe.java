public class Girafe extends Mammal implements Prey {

    public Girafe(String animalName, int old, String abilities, int runningVelocity) {
        super(animalName, old, abilities, runningVelocity);
    }

    @Override
    public String getName() {
        return animalName;

    }

}
