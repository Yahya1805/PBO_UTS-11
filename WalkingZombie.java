public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (level == 1)
            health += health * 0.2;
        else if (level == 2)
            health += health * 0.3;
        else if (level == 3)
            health += health * 0.4;
    }

    @Override
    public void destroyed() {
        health -= health * 0.2;
        if (health <= 0) {
            health = 0;
            System.out.println("Walking Zombie kalah!");
        }
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie => " + super.getZombieInfo();
    }
}
