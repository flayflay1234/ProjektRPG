package rpg.model;

public class Mag extends Postac {
    private int mana;

    public Mag(String imie) {
        super(imie, 80, 25);
        this.mana = 50;
    }

    @Override
    public void atakuj(Postac cel) {
        if (mana >= 15) {
            System.out.println(getImie() + " rzuca Kule Ognia!");
            cel.otrzymajObrazenia(getSilaAtaku() * 2);
            mana -= 15;
        } else {
            System.out.println(getImie() + " nie ma many! Uderza kosturem...");
            cel.otrzymajObrazenia(5);
        }
    }
}
