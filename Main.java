package lesson1;

public class Main {
    public static void main(String[] args) {
        Human h = new Human("Дима", 1, 20);
        Cat c = new Cat("13", 2, 15);
        Robot r = new Robot("Андрей", 3, 25);


        Wall wall = new Wall(3) ;
        Track track = new Track(15);

        Doable[] doable = new Doable[]{h, c, r};
        for (Doable doables : doable) {
            doables.run((Track) track);
            doables.jump((Wall) wall);
        }
    }

}
