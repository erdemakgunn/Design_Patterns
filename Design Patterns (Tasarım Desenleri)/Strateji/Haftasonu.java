package Strateji;

public class Haftasonu implements Duzen {

    @Override
    public double FiyatHesapla(double fiyat) {
        return fiyat * 0.7;
    }

    @Override
    public String TasarimiGetir() {
        return "Haftasonu";
    }
}
