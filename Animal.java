public abstract class Animal {

    String animalName;
    int old;
    String abilities;

    public Animal(String animalName, int old, String abilities) {
        this.animalName = animalName;
        this.old = old;
        this.abilities = abilities;
    }

    public void show() {
        System.out.println(animalName + " " + old + " " + abilities);

    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getOld() {
        return this.old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAbilities() {
        return this.abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

}
