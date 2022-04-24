package BridgeUzem;

public class WinUI extends UI {

    IRenk renk;

    public WinUI(IRenk renk) {
        this.renk = renk;
    }

    @Override
    public void uiOlustur() {
        String renkParametresi = renk.renkOlustur();
        System.out.println(renkParametresi + " ile WinUI oluşturuldu...");

    }
}
