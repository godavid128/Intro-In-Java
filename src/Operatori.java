public class Operatori {
    public static void main(String[] args) {
        boolean a = true;
        int b = 5;
        System.out.println(b == b);
        System.out.println(7 > b && 8 > b);
        System.out.println(7 > b && 3 > b);
        System.out.println(7 > b || 3 > b);
        System.out.println(7 > b && (8 > b || 3 > b));
        System.out.println(7 <= b);
    }
}
