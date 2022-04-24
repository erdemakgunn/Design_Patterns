package Facade;

public class Klima {
    private int sicaklik;


    public void guncelle(int sicaklik) {
        this.sicaklik = sicaklik;
        System.out.println("Klima " + sicaklik + " dereceye ayarlandı");

    }

    public void ac() {
        System.out.println("Klima açıldı");
    }

    public void kapat() {
        System.out.println("Klima kapatıldı");
    }
}
