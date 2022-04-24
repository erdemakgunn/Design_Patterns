package Facade;

public class Televizyon {
    private int sesSeviye=10, kanalNumara=1;


    public void Televizyon() {
        sesSeviye = 10;
        kanalNumara = 1;

    }

    public void ac() {
        System.out.println("Televizyon açıldı");
    }

    public void kapat() {
        System.out.println("Televizyon kapatıldı");
    }

    public void sesAzalt() {
        sesSeviye -= 1;
        System.out.println("Televizyon ses seviyesi azaltıldı.." + sesSeviye);
    }

    public void sesArtir() {
        sesSeviye += 1;
        System.out.println("Televizyon ses seviyesi artırıldı.." + sesSeviye);
    }

    public void kanalAzalt() {
        kanalNumara -= 1;
        System.out.println("Televizyon kanal seviyesi azaltıldı.." + kanalNumara);

    }

    public void kanalArtir() {
        kanalNumara += 1;
        System.out.println("Televizyon kanal seviyesi artırıldı.." + kanalNumara);
    }


}
