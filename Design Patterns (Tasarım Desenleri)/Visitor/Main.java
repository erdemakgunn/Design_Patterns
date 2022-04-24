package VisitorUzem;

import java.util.MissingResourceException;

public class Main {

    public static void main(String[] args) {

        Visitor visitor = new HikayeGosterici();

        IMesajIslem iMesajIslem = new NormalKullanici();

        iMesajIslem.accept(visitor);

        visitor = new MesajKaydetme();
        iMesajIslem.accept(visitor);

        iMesajIslem = new PremiumKullanici();
        visitor = new MesajKaydetme();
        iMesajIslem.accept(visitor);
        
        visitor = new HikayeGosterici();
        iMesajIslem.accept(visitor);


    }
}
