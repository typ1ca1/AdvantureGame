public class Sword extends Weapon{

    private Sharpness sharpness;
    public Sword(String name, String description, int value, int damage, Sharpness sharpness){
        super(name, description, value, damage);
        this.sharpness = sharpness;
    }
}
