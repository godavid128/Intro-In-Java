public class While {
    public static void main(String[] args) {
        int litri_benzina = 10;

        while(litri_benzina > 0) {
            System.out.println("Vrum, Vrum");
            --litri_benzina;
            if (litri_benzina <= 3) {
                System.out.println("Se aprinde becul rosu!");
            }
        }

        System.out.println("STOP! Nu mai avem benzina");
    }
}
