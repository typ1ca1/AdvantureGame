public class GiantSpiderCave extends EnemyCave{

    public GiantSpiderCave(int x, int y, Enemy giantSpider){
        super(x, y, giantSpider);
    }

    public String intro_text(){
        if(enemy.is_alive())
            return "\n You entered a mysterious cave and see a giant spider on the roof. You have a choice to fight them or runaway";
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
