package ChainofResponsibility;

public class KrediSkorKontrol extends Kredi {

    @Override
    public boolean Islem(Musteri musteri ) {

        return musteri.getSkor()>1500;


    }
}
