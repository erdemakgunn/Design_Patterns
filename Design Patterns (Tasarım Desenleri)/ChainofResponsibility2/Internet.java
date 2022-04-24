package ChainofResponsibilityUzem;

public class Internet extends Servis {


    @Override
    public void uygula(Istek istek) {
        int ilkIP = IpCozumle.get(istek.getIp());
        if (ilkIP > 200 && ilkIP < 255) {
            System.out.println("Internet ağdaki " + istek.getIp() + " adresine " + istek.getTip() + " isteği yapıldı.");

        } else {
            if (getSonraki() != null) {
                getSonraki().uygula(istek);
            }
        }


    }
}
