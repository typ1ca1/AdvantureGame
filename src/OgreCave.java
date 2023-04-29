

public class OgreCave extends EnemyCave{

    public OgreCave(int x, int y, Ogre ogre){
        super(x, y, ogre);
    }

    public String intro_text(){
        if (enemy.is_alive())
            return "\n This cave is occupied with one big ogre. You have a choice to fight them or runaway";
        else{
            return "\n This cave is free from monsters.";
        }
    }

    public void modify_player(Player the_player){
        if (enemy.is_alive()){
            the_player.attackEnemy(enemy);
            the_player.hp = the_player.hp - enemy.damage;
            System.out.printf("\n Enemy does %d damage. You have %d HP remaining.", enemy.damage,the_player.hp);
        }


    }

}
