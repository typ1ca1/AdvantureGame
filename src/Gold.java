public class Gold extends Item {
    protected int amt;

    public Gold(int amt){
        super("Gold", String.format("A round coin with %s stamped on the front", String.valueOf(amt)), amt);
        this.amt = amt;
    }

    public String toString() {
        return String.format("You have %s coins of gold", amt);
    }
}
