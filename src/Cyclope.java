public class Cyclope extends  Enemy{

    private String eyeColor;

    public Cyclope(String name, int hp, int damage, String eyeColor){
        super(name, hp, damage);
        this.eyeColor = eyeColor;
    }
}
