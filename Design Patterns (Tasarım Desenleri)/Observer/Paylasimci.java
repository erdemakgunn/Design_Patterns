package ObserverUzem;

import java.util.ArrayList;
import java.util.List;

public abstract class Paylasimci {
    private String isim;
    private List<Takipci> takipcisListe;


    public Paylasimci(String isim) {
        //this.isim=isim;
        setIsim(isim);
        takipcisListe = new ArrayList<>();
    }

    public abstract void paylas(Post post);



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void takipciEkle(Takipci takipci) {
        takipcisListe.add(takipci);
    }

    public void takipciCikar(Takipci takipci) {
        takipcisListe.remove(takipci);
    }

    public void tumunuBilgilendir(Post post) {
        for (Takipci takipci : takipcisListe) {
            takipci.bilgilendir(post);
        }
    }


}
