package VisitorUzem;

public class PremiumKullanici implements IMesajIslem {
    @Override
    public void kisibul(String kisi) {
        System.out.println("Premium kullanıcı " + kisi + " adli kisi bulundu.");
    }

    @Override
    public void mesajAl() {
        System.out.println("Premium kullanıcı " + "Mesaj alınıyor..");
    }

    @Override
    public void mesajGonder(String msg) {
        System.out.println("Premium kullanıcı " + msg + " mesajı gönderiliyor");
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
