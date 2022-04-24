package Composite;

public class Main {

    public static void main(String[] args) {

        Gelistirici gelistirici1 = new Gelistirici("Erdem Akgün", 100, "Pro geliştirici");
        Gelistirici gelistirici2 = new Gelistirici("Türkay Akgün", 101, "geliştirici");
        SirketBilgisi engDirectory = new SirketBilgisi();
        engDirectory.add(gelistirici1);
        engDirectory.add(gelistirici2);

        Yonetici yonetici1 = new Yonetici("Ali veli", 200, "SEO yönetici");
        Yonetici yonetici2 = new Yonetici("Ahmet Korkmaz", 201, "Düz yönetici");

        SirketBilgisi accDirectory = new SirketBilgisi();
        accDirectory.add(yonetici1);
        accDirectory.add(yonetici2);

        SirketBilgisi bilgi = new SirketBilgisi();
        bilgi.add(engDirectory);
        bilgi.add(accDirectory);
        bilgi.calisanGoster();


    }
}
