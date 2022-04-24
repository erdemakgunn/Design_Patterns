package ChainofResponsibilityUzem;

public class Yerel extends Servis {


    @Override
    public void uygula(Istek istek) {

        if (IpCozumle.get(istek.getIp()) < 100) {
            System.out.println("Yerel ağdaki " + istek.getIp() + " adresine " + istek.getTip() + " isteği yapıldı.");

        } else {
            if (getSonraki() != null) {
                getSonraki().uygula(istek);
            }
        }


    }
}
