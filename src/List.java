import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        java.util.List<String> fructe = new ArrayList();
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");
        System.out.println((String)fructe.get(0));
        System.out.println((String)fructe.get(2));
        System.out.println(fructe.indexOf("banana"));
        System.out.println(fructe.isEmpty());
        fructe.remove("mar");
        System.out.println(fructe.size());
        System.out.println(fructe);
        if (!fructe.isEmpty()) {
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu avem ce manca");
        }

        java.util.List<Integer> numere = Arrays.asList(1, 33, 77);
        System.out.println(numere);
        String[] animals = new String[]{"urs", "vulpe", "iepure"};
        java.util.List<String> animalsList = new ArrayList(Arrays.asList(animals));
        animalsList.add("lup");
        System.out.println(animalsList);
        int vulpe_index = animalsList.indexOf("vulpe");
        animalsList.remove(vulpe_index);
        animalsList.remove("iepure");
        System.out.println(animalsList);
    }
}
