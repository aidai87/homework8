package kg.geektech.game.players;

public class Golem extends Hero{
    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.SMALL_DAMAGE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int partDamage = boss.getDamage() / 5 ;
        int aliveHeroes = 0;
        if(this.getDamage()>0){
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i]==this) {
                    continue;

                }else if(heroes[i].getHealth()>0){
                    heroes[i].setHealth(heroes[i].getHealth()+ partDamage);
                    aliveHeroes++;
                }
            }
            this.setHealth(this.getHealth()-partDamage*aliveHeroes);
            System.out.println("Golem take: "+(partDamage * aliveHeroes));
        }
    }
}
