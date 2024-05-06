import java.util.ArrayList;

public class Cage {

    private static ArrayList<Animal> cage;

    public Cage() {
        this.cage = new ArrayList<>();

    }

    public void addAnimal(Animal animal) {

        cage.add(animal);

    }

    public static void removeAnimal(Prey prey) {

        cage.remove(prey);

    }

    public ArrayList<Animal> getCage() {
        return this.cage;
    }

    public void setCage(ArrayList<Animal> cage) {
        this.cage = cage;
    }

}
