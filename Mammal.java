public abstract class Mammal extends Animal {

    private int runningVelocity;

    public Mammal(String animalName, int old, String abilities, int runningVelocity) {
        super(animalName, old, abilities);
        this.runningVelocity = runningVelocity;
    }

    public void show() {
        System.out.println(animalName + " " + old + " " + runningVelocity + " \"" + abilities + "\"");

    }

    public int getRunningVelocity() {
        return this.runningVelocity;
    }

    public void setRunningVelocity(int runningVelocity) {
        this.runningVelocity = runningVelocity;
    }
    

}
