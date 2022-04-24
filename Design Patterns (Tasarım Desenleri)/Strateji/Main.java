package Strateji;

public class Main {

    public static void main(String[] args) {

        Duzen standart = new Standart();
        Duzen haftasonu = new Haftasonu();
        Duzen yilbasi = new Yilbasi();

        Magaza magaza = new Magaza();


        magaza.setDuzen(standart);
        magaza.FiyatHesapla(1000);
        magaza.TasarimiGoster();

        magaza.setDuzen(haftasonu);
        magaza.FiyatHesapla(1000);
        magaza.TasarimiGoster();

        magaza.setDuzen(yilbasi);
        magaza.FiyatHesapla(1000);
        magaza.TasarimiGoster();

    }
}
