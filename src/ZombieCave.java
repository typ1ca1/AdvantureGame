public class ZombieCave extends EnemyCave{


    public ZombieCave(int x, int y, Enemy zombie){
        super(x, y, zombie);

    }

    public String intro_text() {
        if (enemy.is_alive())
            return "\n You found a cave of Zombies. You have a choice to fight them or runaway";
        else {
            return "\n This cave is free from monsters.";
        }
    }

    @Override
    public void modify_player(Player the_player) {
        if (enemy.is_alive()) {
            the_player.attackEnemy(enemy);
            the_player.hp = the_player.hp - enemy.damage;
            System.out.printf("\n Enemy does %d damage. Enemy's HP %d. You have %d HP remaining.", enemy.damage, enemy.hp, the_player.hp);
        }
    }

}
