package rpg.model;

public class Wojownik extends Postac {
    private int tarcza;

    public Wojownik(String imie) {
        super(imie, 120, 15);
        this.tarcza = 20;
    }

    @Override
    public void atakuj(Postac cel) {
        System.out.println(getImie() + " uderza mieczem!");

        cel.otrzymajObrazenia(getSilaAtaku());
    }

    @Override
    public void otrzymajObrazenia(int punkty) {
        if (tarcza > 0) {
            System.out.println(getImie() + " blokuje! Zmniejszono obrażenia o 5.");
            punkty = Math.max(0, punkty - 5);
            tarcza -= 5;
        }

        super.otrzymajObrazenia(punkty);
    }
}
