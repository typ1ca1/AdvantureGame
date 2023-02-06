import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Gold goldBar = new Gold(10);
        Weapon magicSword = new Weapon("Magic Sword", "qwe", 20, 50);
        Weapon softPillow = new Weapon("Soft Pillow", "A super soft pillow", 3, 1);
        Weapon bigMace = new Weapon("A big mace", "Biggest mace in the world", 10, 20);
        Ogre greenOgre = new Ogre("Green Ogre", 30, 25);
        Ogre redOgre = new Ogre("Red Ogre", 35, 30);
        Zombie slowZombie = new Zombie("Slow Zombie", 20, 35);
        Zombie fastZombie = new Zombie("Fast Zombie", 50, 10);
        Dog spotDog = new Dog("Spot Dog", 20, 15);
        Skeleton bigSkeleton = new Skeleton("Big Skeleton", 40, 20, "Bow shoots with three arrows at a time.");
        System.out.println(greenOgre.getEnemyName());
        System.out.println(redOgre.getEnemyName());
        System.out.println(slowZombie.getEnemyName());
        System.out.println(fastZombie.getEnemyName());
        System.out.println(spotDog.getEnemyName());
        System.out.println(bigSkeleton.getEnemyName());
    }
}