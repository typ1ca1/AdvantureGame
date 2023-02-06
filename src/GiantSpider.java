public class GiantSpider extends Enemy{

    private String venomous;
    public GiantSpider(String name, int hp, int damage, String venomous){
        super(name, hp, damage);
        this.venomous = venomous;
    }
}
