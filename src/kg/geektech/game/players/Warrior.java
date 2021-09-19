package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int coef = RPG_Game.random.nextInt(3) + 2;
        int critDamage = this.getDamage() * coef;
        if (this.getHealth()>0){
            boss.setHealth(boss.getHealth()-critDamage);
            System.out.println("Critical damage" + critDamage);
        }
    }
}
