
public class Main {

    public static void main(String[] args) {

        Cage cage = new Cage();

        Eagle eagle1 = new Eagle("eagle1", 12, "flys", 256);
        Eagle eagle2 = new Eagle("eagle2", 100, "does not fly", 1);
        Cheetah cheetah1 = new Cheetah("cheetah1", 30, "sharp teeth", 126);
        Cheetah cheetah2 = new Cheetah("cheetah2", 50, "does not hava sharp teeth", 133);
        Parrot parrot1 = new Parrot("parrot1", 9, "loves seeds", 22);
        Parrot parrot2 = new Parrot("parrot2", 10, "does not love seeds", 23);
        Girafe girafe1 = new Girafe("girafe1", 4, "dorf one", 5);
        Girafe girafe2 = new Girafe("girafe2", 99, "old one", 6);

        cage.addAnimal(eagle1);
        cage.addAnimal(eagle2);
        cage.addAnimal(cheetah1);
        cage.addAnimal(cheetah2);
        cage.addAnimal(parrot1);
        cage.addAnimal(parrot2);
        cage.addAnimal(girafe1);
        cage.addAnimal(girafe2);

        System.out.println("----------------------------------------");
        int row = 1;
        for (Animal animal : cage.getCage()) {
            System.out.print(row + "# ");
            animal.show();
            row++;

        }
        System.out.println("----------------------------------------");
        cheetah1.hunt(girafe2);
        eagle1.hunt(parrot2);
        System.out.println("----------------------------------------");

        row = 1;
        for (Animal animal : cage.getCage()) {
            System.out.print(row + "# ");
            animal.show();
            row++;

        }
        System.out.println("----------------------------------------");

    }
    
}
