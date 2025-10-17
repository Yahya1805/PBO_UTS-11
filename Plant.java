public class Plant {
    public void doDestroy(Destroyable d) {
        d.destroyed();

        if (d instanceof Zombie) {
            Zombie z = (Zombie) d;
            if (z.health <= 0) {
                System.out.println("Zombie kalah!");
            }
        } else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            if (b.getStrength() <= 0) {
                System.out.println("Barrier kalah!");
            }
        }
    }
}
