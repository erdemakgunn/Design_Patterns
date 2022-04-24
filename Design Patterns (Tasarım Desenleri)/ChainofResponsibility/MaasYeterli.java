package ChainofResponsibility;

public class MaasYeterli extends Kredi {

    @Override
    public boolean Islem(Musteri musteri) {

        return musteri.isMaas();

    }
}
