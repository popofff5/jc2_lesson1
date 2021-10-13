package lesson1;

public class Human implements Doable {
    private String name;
    private int height;
    private int interval;

    public Human(String name, int height, int interval) {
        this.name = name;
        this.height = height;
        this.interval = interval;
    }

    @Override
    public void jump(Wall wall) {
        if (wall.height >= this.height) {
            System.out.println("Человек не прыгнул");
        }
        if (wall.height < this.height) {
            System.out.println("Человек перепрыгнул");
        }
    }

    @Override
    public void run(Track track) {
        if (track.interval >= this.interval) {
            System.out.println("Человек не пробежал");
        }
        if (track.interval < this.interval) {
            System.out.println("Человек пробежал");
        }
    }
}

