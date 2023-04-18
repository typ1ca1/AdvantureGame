public class CyclopsCave extends EnemyCave{

    public CyclopsCave(int x, int y, Enemy cyclope){
        super(x, y, cyclope);
    }

    public String intro_text(){
        if(enemy.is_alive())
            return "\n It is a cave of Cyclops. There are 4 of them. You have a choice to fight them or runaway";
        else{
            return "\n This cave is free from monsters.";
        }
    }
    @Override
    public void modify_player(Player the_player){
        if (enemy.is_alive()){
            the_player.hp = the_player.hp - enemy.damage;
        }
        System.out.printf("Enemy does %d damage. You have %d HP remaining.", enemy.damage, the_player.hp);
    }

}
