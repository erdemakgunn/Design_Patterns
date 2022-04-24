package Composite;

import java.util.ArrayList;
import java.util.List;

public class SirketBilgisi implements ICalisan {
    private List<ICalisan> calisanList = new ArrayList<ICalisan>();

    @Override
    public void calisanGoster() {
        for (ICalisan calisan : calisanList) {
            calisan.calisanGoster();

        }

    }


    public void add(ICalisan calisan) {
        calisanList.add(calisan);
    }

    public void remove(ICalisan calisan) {
        calisanList.remove(calisan);
    }


}
