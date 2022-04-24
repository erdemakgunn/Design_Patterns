package Adapter;

public class UzakHedefKayitAdapter implements IYedekleyici {


    private UzakHedefeKayit uzakKayit;

    @Override
    public void Kaydet(String kaynakKlasorKonumu, String hedefKlasorKonumu) {

        uzakKayit = new UzakHedefeKayit();
        uzakKayit.UzakHedefeKaydet(kaynakKlasorKonumu, hedefKlasorKonumu);

    }


}
