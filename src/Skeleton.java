public class Skeleton extends Enemy{

    private String bowDescription;
    public Skeleton(String name, int hp, int damage, String bowDescription){
        super(name, hp, damage);
        this.bowDescription = bowDescription;
    }
}
