package VisitorUzem;

public interface IMesajIslem {


    void kisibul(String kisi);

    void mesajAl();

    void mesajGonder(String msg);

    void accept(Visitor visitor);

}
