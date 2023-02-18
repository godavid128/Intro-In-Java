public class Functii {
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c) / 3.0;
        return media;
    }

    public static double piValue() {
        double PI = 3.14;
        return 3.14;
    }

    public static void main(String[] args) {
        printGreeting();
        printGreeting();
        printGreetingByName("Gorodetchi", "David");
        printGreetingByName("Gorodetchi", "Angy");
        printGreetingByName("Gorodetchi", "Tabita");
        printGreetingByName("Gorodetchi", "Titus");
        System.out.println(mediaNr(3.0, 3.0, 4.0));
        double media1 = mediaNr(312313.0, 345.0, 23.0);
        double media2 = mediaNr(31.0, 54.0, 65.0);
        double media3 = mediaNr(89.0, 354.0, 34.0);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);
        System.out.println(piValue());
        System.out.println(piValue());
        String nume = "Gorodetchi";
        System.out.println(nume.length());
    }
}
