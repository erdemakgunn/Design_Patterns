package Composite;

public class Yonetici implements ICalisan {


    private String isim;
    private int id;
    private String pozisyon;

    public Yonetici(String isim, int id, String pozisyon) {
        this.isim = isim;
        this.id = id;
        this.pozisyon = pozisyon;
    }

    @Override
    public void calisanGoster() {
        System.out.println(id + " " + isim);

    }


}
