package VisitorUzem;

public class NormalKullanici implements IMesajIslem {
    @Override
    public void kisibul(String kisi) {
        System.out.println("Normal kullanıcı " + kisi + " adli kisi bulundu.");
    }

    @Override
    public void mesajAl() {
        System.out.println("Normal kullanıcı " + "Mesaj alınıyor..");
    }

    @Override
    public void mesajGonder(String msg) {
        System.out.println("Normal kullanıcı " + msg + " mesajı gönderiliyor");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
