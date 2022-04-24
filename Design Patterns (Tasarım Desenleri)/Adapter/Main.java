package Adapter;

public class Main {

    public static void main(String[] args) {
        String kaynak = "C://YedeklenecekKlasör";

        IYedekleyici yedekleme;

        yedekleme = new DiskYedekleyici();
        yedekleme.Kaydet(kaynak, "D://HedefDiskKonumu");

        yedekleme = new FlashYedekleyici();
        yedekleme.Kaydet(kaynak, "U://HedefFlashDiskKonumu");

        yedekleme = new UzakHedefKayitAdapter();
        yedekleme.Kaydet(kaynak, "www.abcd.com/hedefWebKonumu");


    }


}
