public class Parrot extends Bird implements Prey {

    public Parrot(String animalName, int old, String abilities, int flyHeight) {
        super(animalName, old, abilities, flyHeight);
    }

    public String getName() {
        return animalName;

    }

}
