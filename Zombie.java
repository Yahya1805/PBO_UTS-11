public class Zombie extends Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() { }

    @Override
    public void destroyed() {
        health -= (health * 0.2);
        if (health < 0) health = 0;
    }

    public String getZombieInfo() {
        return "Health: " + health + "\nLevel: " + level + "\n";
    }
}
 