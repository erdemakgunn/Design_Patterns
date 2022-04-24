package VisitorUzem;

public class GoldKullanici implements IMesajIslem {
    @Override
    public void kisibul(String kisi) {
        System.out.println("Gold kullanıcı " + kisi + " adli kisi bulundu.");
    }

    @Override
    public void mesajAl() {
        System.out.println("Gold kullanıcı " + "Mesaj alınıyor..");
    }

    @Override
    public void mesajGonder(String msg) {
        System.out.println("Gold kullanıcı " + msg + " mesajı gönderiliyor");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
