public class Dog extends Enemy{

    private String tamed;
    public Dog(String name, int hp, int damage, String tamed){
        super(name, hp, damage);
        this.tamed = tamed;
    }
}
