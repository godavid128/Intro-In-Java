public class ContBancar {
    String titularCont;
    String iban;
    double sold = 0.0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;

    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    public void interogareSold() {
        System.out.println("Titular " + this.titularCont);
        System.out.println("Iban " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Nr de incercari gresite " + this.incercari_activare);
        System.out.println("-------------------------- ");
    }

    public void activareCont(int pinUtilizator) {
        System.out.println("Buna " + this.titularCont);
        if (pinUtilizator == this.pin) {
            System.out.println("Card activat cu succes ");
            this.activ = true;
        } else {
            System.out.println("PIN gresit");
            ++this.incercari_activare;
        }

    }

    public void alimentareCont(double suma_depusa) {
        this.sold += suma_depusa;
        System.out.println("Buna " + this.titularCont);
        System.out.println("Ati depus cu succes suma de " + suma_depusa + " Aveti in cont suma de " + this.sold);
    }

    public void plataCard(double suma_cheltuita) {
        System.out.println("Buna " + this.titularCont);
        if (suma_cheltuita <= this.sold) {
            this.sold -= suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai " + this.sold);
        } else {
            System.out.println("Fonduri insuficiente");
        }

    }
}
