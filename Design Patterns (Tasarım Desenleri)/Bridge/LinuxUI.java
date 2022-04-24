package BridgeUzem;

public class LinuxUI extends UI {
    IRenk renk;
    public LinuxUI(IRenk renk){
        this.renk=renk;

    }

    @Override
    public void uiOlustur() {
        String renkParametresi=renk.renkOlustur();
        System.out.println(renkParametresi + " ile LinuxUI oluşturuldu...");
    }
}
