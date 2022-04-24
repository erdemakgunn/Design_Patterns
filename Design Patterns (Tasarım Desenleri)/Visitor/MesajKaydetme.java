package VisitorUzem;

public class MesajKaydetme implements Visitor {

    @Override
    public void visit(NormalKullanici normal_k) {
        System.out.println("Normal Kullanıcının mesaj kaydetme özelliği bulunmamaktadır.");
    }

    @Override
    public void visit(PremiumKullanici prem_K) {
        System.out.println("Premium Kullanıcı için mesaj kaydediliyor.");
    }

    @Override
    public void visit(GoldKullanici gold_k) {
        System.out.println("Gold Kullanıcı için mesaj kaydediliyor.");
    }
}
