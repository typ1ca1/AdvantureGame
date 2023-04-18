public class TreasureCave extends LootCave{

    public TreasureCave(int x, int y, Gold geld){
        super(x, y, geld);
    }

    public String intro_text(){
        if(pickedItem == false)
            return String.format("\n You found a treasure cave with 5 golds.");
        else
            return "";
    }

    //public void modify_player(Player player){
    //    if (pickedItem == false)
    //        add_Loot(player);
    //}
}
