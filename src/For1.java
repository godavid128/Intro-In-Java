public class For1 {
    public static void main(String[] args) {
        // for -loop, str repetitive
        // de unde incepem; pana unde mergem, pas de parcurgere
        // prob: printam 101 dalmatieni
        for (int i = 1; i <= 10; i++) {
            System.out.println("Dalmatianul cu nr " + i);
        }
        // ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 10, 20, 30}; // numere[0] = 3
        for (int i = 0; i < numere.length; i++) {
            System.out.println("elementul are index " + i + " si valoarea " + numere[i]);
        }
        // for each - parcurge toat elem din array si ajunge direct la valoar
        for (int numar: numere) {
            System.out.println("Numarul este: " + numar);
        }
        // parcurgem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare: culori) {
            System.out.println("Culoarea actuala este " + culoare);
        }
        // suma numerelor din array
        int s = 0;
        for (int numar: numere) {
            s = s + numar; // suma 3, si numar 7; 10 +10
        }
        System.out.println(s);
    }
}
