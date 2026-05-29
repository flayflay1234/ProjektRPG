package rpg.model;

public class Przeciwnik extends Postac {
    public Przeciwnik(String imie, int zdrowie, int silaAtaku) {
        super(imie, zdrowie, silaAtaku);
    }

    @Override
    public void atakuj(Postac cel) {
        System.out.println(getImie() + " gryzie i drapie!");
        otrzymajObrazenia(getSilaAtaku());
    }
}
