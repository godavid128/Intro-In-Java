public class Array {
    public static void main(String[] args) {
        String[] elevi = new String[]{"Gigel", "Costel", "Mari", "Ela", "Ada"};
        int[] var10000 = new int[]{1, 33, 81, 99, 201};
        System.out.println(elevi[2]);
        elevi[2] = "Sebi";
        System.out.println(elevi[2]);
        System.out.println(elevi.length);
        System.out.println(elevi[0] + " " + elevi[1]);
        System.out.println(elevi.length + 5);
        System.out.println("Derniere place: " + elevi[elevi.length - 1]);
        int[] note = new int[5];
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
        System.out.println(note[1]);
    }
}
