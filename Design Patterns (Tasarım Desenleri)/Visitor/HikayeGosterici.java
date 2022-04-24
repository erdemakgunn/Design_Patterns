package VisitorUzem;

//Concrete Visitor
public class HikayeGosterici implements Visitor {
    @Override
    public void visit(NormalKullanici normal_k) {
        System.out.println("Normal Kullanıcı için hikaye gösterilir.");
    }

    @Override
    public void visit(PremiumKullanici prem_K) {
        System.out.println("Premium Kullanıcı için hikaye gösterilir.");
    }

    @Override
    public void visit(GoldKullanici gold_k) {
        System.out.println("Gold Kullanıcı için hikaye gösterilir.");
    }
}
