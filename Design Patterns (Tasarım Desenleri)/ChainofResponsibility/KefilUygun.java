package ChainofResponsibility;

public class KefilUygun extends Kredi {


    @Override
    public boolean Islem( Musteri musteri) {

        return musteri.isKefil();

    }
}
