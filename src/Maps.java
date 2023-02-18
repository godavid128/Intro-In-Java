import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // map - reprezentare de date in sistem cheie-valoare
        // ex: gigel are nota 10, costel - 9
        Map<String, Integer> note_elevi = new HashMap();
        // adaugam elemente
        note_elevi.put("Gigi", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 8);
        // aflam notele
        System.out.println("Ana are nota " + note_elevi.get("Ana"));
        // suprascriem- actualizam valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si a marit nota " + note_elevi.get("Costel"));
        // aflam dimesiunea
        System.out.println(note_elevi.size());
        // stergem dupa cheie
        note_elevi.remove("Gigi");
        System.out.println(note_elevi.size());
    }
}
