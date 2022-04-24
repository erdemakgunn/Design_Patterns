package ChainofResponsibilityUzem;

public class Intranet extends Servis {


    @Override
    public void uygula(Istek istek) {
        int ilkIP = IpCozumle.get(istek.getIp());
        if (ilkIP < 200 && ilkIP > 100) {
            System.out.println("Intranet ağdaki " + istek.getIp() + " adresine " + istek.getTip() + " isteği yapıldı.");

        } else {
            if (getSonraki() != null) {
                getSonraki().uygula(istek);
            }
        }


    }


}
