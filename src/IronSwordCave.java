public class IronSwordCave extends LootCave {

    public IronSwordCave(int x, int y, IronSword ironSword) {
        super(x, y, ironSword);
    }

    public String intro_text() {
        return "\n You found a loot cave with a iron sword.";
    }

    public void modify_player(Player player) {
        if (pickedItem == false)
            add_Loot(player);
        else {
            System.out.println("The sword is already picked up");
        }
    }
}
