package Facade;

public class Main {

    public static void main(String[] args) {

        Klima klima = new Klima();
        Kapi kapi = new Kapi();
        Isik isik = new Isik(5);
        Televizyon televizyon = new Televizyon();



    /*
        klima.guncelle(25);
        klima.ac();
        klima.kapat();

        kapi.kilitle();
        kapi.kilidAc();

        isik.ac(1);
        isik.kapat(2);

        televizyon.ac();
        televizyon.sesArtir();
        televizyon.kanalAzalt();
        televizyon.sesAzalt();
        televizyon.kanalArtir();*/


        televizyon.ac();
        televizyon.sesArtir();
        for (int i = 0; i < 5; i++) {
            isik.kapat(i);
        }
        klima.kapat();


        AkilliEvSistemi akilliEvSistemi = new AkilliEvSistemi(5);
        akilliEvSistemi.klimaGuncelle(25);
        akilliEvSistemi.kapiKilitle();
        akilliEvSistemi.IsikAc(3);
        akilliEvSistemi.tvAc();


        akilliEvSistemi.sinemaModu();
        akilliEvSistemi.uykuModu();


    }
}
