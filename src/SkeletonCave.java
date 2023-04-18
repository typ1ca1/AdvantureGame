public class SkeletonCave extends EnemyCave{

    public SkeletonCave(int x, int y, Enemy skeleton){
        super(x,y,skeleton);
    }

    public String intro_text(){
        if (enemy.is_alive())
            return "\n You found a cave of Skeleton. You have a choice to fight them or runaway";
        else {
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
