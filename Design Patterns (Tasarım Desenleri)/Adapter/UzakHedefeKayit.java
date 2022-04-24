package Adapter;

public class UzakHedefeKayit {


    public void UzakHedefeKaydet(String kaynakDosya, String hedefKonum) {

        BaglantiKur(hedefKonum);
        DosyalarıGonder(kaynakDosya);
        BaglantiyiKapat();

    }

    private void BaglantiKur(String hedef) {
        System.out.println(hedef + " adres ile bağlantı kuruldu..");
    }

    private void DosyalarıGonder(String kaynak) {
        System.out.println(kaynak + " klasöründeki dosyalar hedef konuma gönderiliyor....");
    }

    public void BaglantiyiKapat() {
        System.out.println("Baglanti sonlandirildi");
    }


}
