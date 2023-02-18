public class ContBancarMain {
    public static void main(String[] args) {
        ContBancar cont1 = new ContBancar("David G", "RO201");
        ContBancar cont2 = new ContBancar("Angy G", "RO202");
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);
        cont1.alimentareCont(300.5);
        cont2.alimentareCont(700.0);
        cont2.alimentareCont(300.0);
        cont1.plataCard(500.0);
        cont1.plataCard(300.5);
        cont2.plataCard(100.0);
        cont2.plataCard(200.0);
        cont1.interogareSold();
        cont2.interogareSold();
    }
}
