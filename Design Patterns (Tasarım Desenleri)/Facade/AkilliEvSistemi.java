package Facade;

public class AkilliEvSistemi {

    Klima klima;
    Kapi kapi;
    Isik isik;
    Televizyon televizyon;


    public AkilliEvSistemi(int adet) {
        klima = new Klima();
        kapi = new Kapi();
        isik = new Isik(adet);
        televizyon = new Televizyon();

    }

    public void klimaGuncelle(int sicaklık) {
        klima.guncelle(sicaklık);
    }

    public void klimaAc() {
        klima.ac();
    }

    public void klimaKapat() {
        klima.kapat();
    }

    public void kapiKilitle() {
        kapi.kilitle();
    }

    public void kapiKilidiAc() {
        kapi.kilidAc();
    }

    public void IsikAc(int numara) {
        isik.ac(numara);

    }

    public void IsikKapat(int numara) {
        isik.kapat(numara);
    }

    public void tvAc() {
        televizyon.ac();
    }

    public void tvKapat() {
        televizyon.kapat();
    }

    public void tvSesAzalt() {
        televizyon.sesAzalt();
    }

    public void tvSesArtir() {
        televizyon.sesArtir();
    }

    public void tvKanalAzalt() {
        televizyon.kanalAzalt();
    }

    public void tvKanalArtir() {
        televizyon.kanalArtir();
    }

    public void butunIsiklariKapat() {
        for (int i = 0; i < 5; i++) {
            isik.kapat(i);
        }
    }

    public void sinemaModu() {
        tvAc();
        tvSesArtir();
        butunIsiklariKapat();
        klimaKapat();

    }

    public void uykuModu() {
        klimaKapat();
        butunIsiklariKapat();
        kapiKilitle();

    }

}
