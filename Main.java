public class Main {
    public static void main(String[] args) {
        Gold goldBar = new Gold(10);
        Weapon magicSword = new Weapon("Magic Sword", "qwe", 20, 50);
        Weapon softPillow = new Weapon("Soft Pillow", "A super soft pillow", 3, 1);
        Weapon bigMace = new Weapon("A big mace", "Biggest mace in the world", 10, 20);
        Enemy greenOgre = new Enemy("Green Ogre", 30, 25);
        Enemy redOgre = new Enemy("Red Ogre", 35, 30);
        Enemy slowZombie = new Enemy("Slow Zombie", 20, 35);
        Enemy fastZombie = new Enemy("Fast Zombie", 50, 10);
        Enemy spotDog = new Enemy("Spot Dog", 20, 15);
        Enemy bigSkeleton = new Enemy("Big Skeleton", 40, 20);
    }
}