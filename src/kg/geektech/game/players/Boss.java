package kg.geektech.game.players;

public class Boss extends GameEntity {

    private boolean stun;

    public boolean isStun() {
        return stun;
    }

    public void setStun(boolean stun) {
        this.stun = stun;
    }

    public Boss(int health, int damage) {
        super(health, damage);
    }

}

