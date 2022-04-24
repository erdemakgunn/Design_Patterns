package Adapter;

public class FlashYedekleyici implements IYedekleyici {

    @Override
    public void Kaydet(String kaynakKlasorKonumu, String hedefKlasorKonumu) {
        System.out.println(kaynakKlasorKonumu + " konumundaki dosyalar flash diskte " + hedefKlasorKonumu + " icine yedeklemistir.");
    }
}
