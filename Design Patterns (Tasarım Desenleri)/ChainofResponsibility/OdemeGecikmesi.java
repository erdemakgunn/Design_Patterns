package ChainofResponsibility;

public class OdemeGecikmesi extends Kredi {
    @Override
    public boolean Islem(Musteri musteri) {

        return musteri.getGecikme() < 3;


    }
}
