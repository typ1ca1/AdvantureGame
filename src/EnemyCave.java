import java.util.ArrayList;

public class EnemyCave extends MapTile{

    protected Enemy enemy;

    public EnemyCave(int x, int y, Enemy enemy){
        super(x, y);
        this.enemy = enemy;
    }

    public ArrayList<Action> available_actions(){
        ArrayList<Action> moves = new ArrayList<Action>();
        moves = adjacent_moves();
        moves.add(new ViewInventory());
        if(enemy.is_alive()){
            moves.add(new Attack());
            moves.add(new Flee());
        }
        return moves;
    }



    public void modify_player(Player the_player){
        if (enemy.is_alive()){
            the_player.hp = the_player.hp - enemy.damage;
            System.out.printf("\nThe enemy gave you %d damage. You have %d HP left.", enemy.damage, the_player.hp);

        }
    }




}
