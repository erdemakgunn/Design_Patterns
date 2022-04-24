package AbstractClasslar;

public class Main {

    public static void main(String[] args) {


        Kare kare1 = new Kare("Kare1", 5);
        Daire daire1 = new Daire("Daire1", 3);
        kare1.alan_hesapla();
        kare1.cevre_hesapla();
        daire1.alan_hesapla();

        Sekil sekil = new Kare("Kare2", 5);
        sekil.alan_hesapla();

    }
}
