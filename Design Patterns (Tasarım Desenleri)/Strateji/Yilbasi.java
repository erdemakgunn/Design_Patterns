package Strateji;

public class Yilbasi implements Duzen {
    @Override
    public double FiyatHesapla(double fiyat) {
        return fiyat * 0.5;
    }

    @Override
    public String TasarimiGetir() {
        return "Yılbaşı";
    }
}
