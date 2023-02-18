import java.util.Scanner;

public class ConditionIfElse {
    public static void main(String[] args) {
        System.out.println("pornim radio");
        boolean piesa_faina = false;
        if (piesa_faina) {
            System.out.println("dau mai tare radio");
            System.out.println("incep sa fredonez piesa");
        }

        System.out.println("oprim radio");
        int nr = 3;
        if (nr % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
            if (nr > 0) {
                System.out.println("pozitiv");
            } else {
                System.out.println("nr nu este pozitiv");
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("eng");
                break;
            default:
                System.out.println("optiunea invalida");
        }
    }
}
