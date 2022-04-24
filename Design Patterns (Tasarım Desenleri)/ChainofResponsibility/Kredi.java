package ChainofResponsibility;

public abstract class Kredi {


    public abstract boolean Islem(Musteri musteri);

    private Kredi sonrakiKredi;

    public Kredi getSonrakiKredi() {
        return sonrakiKredi;
    }

    public void setSonrakiKredi(Kredi sonrakiKredi) {
        this.sonrakiKredi = sonrakiKredi;
    }

    public boolean Ilerle(Musteri musteri) {
        if (Islem(musteri)) {
            if (getSonrakiKredi() != null)
                return getSonrakiKredi().Ilerle(musteri);
            return true;
        }

        return false;
    }

}
