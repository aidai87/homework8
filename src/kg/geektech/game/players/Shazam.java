package kg.geektech.game.players;

public class Shazam extends Hero{
    public Shazam(int health, int damage) {
        super(health, damage, SuperAbility.GGG);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        setDamage(getDamage() + 15);
        System.out.println("Shazam shoot from the eyes");

        setHealth(getHealth() - boss.getDamage() + 10);
        System.out.println("Take Small damage");
            }

        }
