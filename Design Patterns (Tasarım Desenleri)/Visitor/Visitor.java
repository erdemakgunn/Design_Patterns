package VisitorUzem;

public interface Visitor {

    void visit(NormalKullanici normal_k);

    void visit(PremiumKullanici prem_K);

    void visit(GoldKullanici gold_k);
}
