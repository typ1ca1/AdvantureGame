public class DoggyCave extends LootCave{
    private Item dog;
    public DoggyCave(int x, int y, Item dog){
        super(x, y, dog);
    }

    public String intro_text(){
        if(pickedItem == false)
            return String.format("\n You found a nice dog that was alone somehow...");
        else
            return "\n Empty Cave...";
    }

    public void modify_player(Player player){
        if (pickedItem == false)
            add_Loot(player);

    }

}
