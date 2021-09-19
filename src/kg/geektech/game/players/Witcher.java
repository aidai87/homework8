package kg.geektech.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.SACRIFICE);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()<=0){
                heroes[i].setHealth(this.getHealth());
                System.out.println("Witcher sacrificed " + heroes[i].getClass().getSimpleName() + "by" + this.getHealth());
            this.setHealth(0);
            break;
            }

        }
    }
}
