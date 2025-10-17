public class MainZombieGame {
   public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());

        System.out.println("== Plant menyerang ==");

        // Ulangi penghancuran beberapa kali sampai zombie dan barrier kalah
        for (int i = 0; i < 10; i++) {
            System.out.println("Serangan ke-" + (i + 1));
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);

            // Tampilkan kondisi setelah setiap serangan
            System.out.println(wz.getZombieInfo());
            System.out.println(jz.getZombieInfo());
            System.out.println(b.getBarrierInfo());
            System.out.println("---------------------");
        }

        System.out.println("== Kondisi Akhir ==");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
    }
}