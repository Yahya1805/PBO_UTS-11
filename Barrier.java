public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= 9;
        if (strength <= 0) {
            strength = 0;
            System.out.println("Barrier kalah!");
        }
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + strength + "\n";
    }
}
