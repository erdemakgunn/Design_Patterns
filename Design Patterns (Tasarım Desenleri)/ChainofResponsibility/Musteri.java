package ChainofResponsibility;

public class Musteri {

    private String isim;
    private int skor;
    private int gecikme;
    private boolean kefil;
    private boolean maas;


    public Musteri(String isim, int skor, int gecikme, boolean kefil, boolean maas) {
        this.isim = isim;
        this.skor = skor;
        this.gecikme = gecikme;
        this.kefil = kefil;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getGecikme() {
        return gecikme;
    }

    public void setGecikme(int gecikme) {
        this.gecikme = gecikme;
    }

    public boolean isKefil() {
        return kefil;
    }

    public void setKefil(boolean kefil) {
        this.kefil = kefil;
    }

    public boolean isMaas() {
        return maas;
    }

    public void setMaas(boolean maas) {
        this.maas = maas;
    }
}
