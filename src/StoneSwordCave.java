public class StoneSwordCave extends LootCave {

    public StoneSwordCave(int x, int y, StoneSword stonesword) {
        super(x, y, stonesword);
    }

    public String intro_text() {
        return "\n You found a loot cave with a stone sword.";
    }

    public void modify_player(Player player) {
        if (pickedItem == false)
            add_Loot(player);
        else {
            System.out.println("The sword is already picked up");
        }
    }
}
