public class BoatCave extends MapTile{

    public BoatCave(int x, int y){
        super(x, y);
    }

    public String intro_text(){
        return "\n You found a cave with the boat. Now you can escape this island. Make sure to grab food before going on a long trip. Good Job!";
    }

    @Override
    public void modify_player(Player player) {
        player.victory = true;
    }
}
