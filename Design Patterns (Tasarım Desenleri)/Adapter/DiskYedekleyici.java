package Adapter;

public class DiskYedekleyici implements IYedekleyici {
    public void Kaydet(String kaynakKlasorKonumu, String hedefKlasorKonumu) {

        //Kaynaktan kopyalayıp hedefe yapistiran
        System.out.println(kaynakKlasorKonumu + " konumundaki dosyaları diskte " + hedefKlasorKonumu + " icine yedeklemistir.");
    }
}
