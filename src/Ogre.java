public class Ogre extends Enemy{

    private String color;
    public Ogre(String name, int hp, int damage, String color){
        super(name, hp, damage);
        this.color = color;
    }
}
