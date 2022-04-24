package BridgeUzem;

public class HighContrast implements IRenk {
    @Override
    public String renkOlustur() {
        System.out.println("Yuksek kontrast renk verileri gönderiliyor...");
        return "Yuksek Kontrast";
    }
}
