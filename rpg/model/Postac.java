package rpg.model;

public abstract class Postac {
    private String imie;
    private int zdrowie;
    private int maxZdrowie;
    private int silaAtaku;

    public Postac(String imie, int zdrowie, int silaAtaku) {
        this.imie = imie;
        this.zdrowie = zdrowie;
        this.maxZdrowie = zdrowie;
        this.silaAtaku = silaAtaku;
    }

    public abstract void atakuj(Postac cel);

    public void otrzymajObrazenia(int punkty) {
        this.zdrowie -= punkty;
        if (this.zdrowie < 0) this.zdrowie = 0;
        System.out.println(imie + " otrzymuje " + punkty + " pkt obrazen. Zostaje: " + zdrowie + " HP.");
    }

    public boolean czyZyje() {
        return this.zdrowie > 0;
    }

    public String getImie() { return imie; }
    public int getZdrowie() { return zdrowie; }
    public int getSilaAtaku() { return silaAtaku; }
    public void setSilaAtaku(int silaAtaku) { this.silaAtaku = silaAtaku; }
}
