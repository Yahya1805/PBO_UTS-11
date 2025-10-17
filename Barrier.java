public class Barrier extends Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        strength -= 9;
        if (strength < 0) strength = 0;
    }

    public int getStrength() {
        return strength;
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + strength + "\n";
    }
}
