public class Zombie extends Enemy{

    private int speed;
    public Zombie(String name, int hp, int damage, int speed){
        super(name, hp, damage);
        this.speed = speed;
    }
}
