package ChainofResponsibility;

public class Main {

    public static void main(String[] args) {

        KrediSkorKontrol krediSkorKontrol = new KrediSkorKontrol();
        OdemeGecikmesi odemeGecikmesi = new OdemeGecikmesi();
        KefilUygun kefilUygun = new KefilUygun();
        MaasYeterli maasYeterli = new MaasYeterli();
        krediSkorKontrol.setSonrakiKredi(odemeGecikmesi);
        odemeGecikmesi.setSonrakiKredi(kefilUygun);
        kefilUygun.setSonrakiKredi(maasYeterli);
        Musteri m1 = new Musteri("isim1", 1400, 2, true, true);
        Musteri m2 = new Musteri("isim2", 1600, 5, true, true);
        Musteri m3 = new Musteri("isim3", 1600, 1, false, true);
        Musteri m4 = new Musteri("isim4", 1600, 0, true, false);
        Musteri m5 = new Musteri("isim5", 2000, 0, true, true);

        musteriKontrol(krediSkorKontrol,m1);
        musteriKontrol(krediSkorKontrol,m2);
        musteriKontrol(krediSkorKontrol,m3);
        musteriKontrol(krediSkorKontrol,m4);
        musteriKontrol(krediSkorKontrol,m5);

    }

    public static void musteriKontrol(Kredi kredi, Musteri musteri) {
        if (kredi.Ilerle(musteri)) {
            System.out.println(musteri.getIsim() + " kredisi onaylandı");
        } else {
            System.out.println(musteri.getIsim() + " kredisi onaylanmadı");
        }
    }
}
