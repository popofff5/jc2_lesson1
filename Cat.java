package lesson1;

public class Cat implements Doable{
    private String name;
    private int height;
    private int interval;

    public Cat(String name, int height, int interval) {
        this.name = name;
        this.height = height;
        this.interval = interval;
    }

    @Override
    public void jump(Wall wall) {
        if (wall.height >= this.height) {
            System.out.println("Кот не прыгнул");
        }
        if (wall.height < this.height) {
            System.out.println("Кот перепрыгнул");
        }
    }

    @Override
    public void run(Track track) {
        if (track.interval >= this.interval) {
            System.out.println("Кот не пробежал");
        }
        if (track.interval < this.interval) {
            System.out.println("Кот пробежал");
        }
    }
}
