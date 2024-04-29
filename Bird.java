public abstract class Bird extends Animal {

    private int flyHeight;

    public Bird(String animalName, int old, String abilities, int flyHeight) {
        super(animalName, old, abilities);
        this.flyHeight = flyHeight;
    }

    public void show() {
        System.out.println(animalName + " " + old + " " + flyHeight + " \"" + abilities + "\"");

    }

    public int getFlyHeight() {
        return this.flyHeight;
    }

    public void setFlyHeight(int flyHeight) {
        this.flyHeight = flyHeight;
    }

}
