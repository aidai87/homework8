package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
boss.setStun(RPG_Game.random.nextBoolean());
if(boss.isStun()){
    System.out.println("Босс оглушен!");

}
    }
}
