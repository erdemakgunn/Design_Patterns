package Strateji;

public class Magaza {
    private Duzen duzen;

    public void FiyatHesapla(double fiyat) {
        System.out.println(duzen.FiyatHesapla(fiyat));
    }

    public void TasarimiGoster() {
        System.out.println(duzen.TasarimiGetir());
    }

    public Duzen getDuzen() {
        return duzen;
    }

    public void setDuzen(Duzen duzen) {
        this.duzen = duzen;
    }
}
