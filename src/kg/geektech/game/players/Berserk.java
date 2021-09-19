package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int partDamage = RPG_Game.random.nextInt(boss.getDamage() - 10) + 10;
        if (this.getHealth() > 0) {
            boss.setHealth(boss.getHealth() - partDamage);
            this.setHealth(this.getHealth()+partDamage);
            System.out.println("Berserk blocked" + partDamage);

        }


    }
}
