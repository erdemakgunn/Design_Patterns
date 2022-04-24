package ChainofResponsibilityUzem;

public class Main {

    public static void main(String[] args) {


        Yerel yerel = new Yerel();
        Intranet intranet = new Intranet();
        Internet internet = new Internet();

        yerel.setSonraki(intranet);
        intranet.setSonraki(internet);

        yerel.uygula(new Istek("15.0.0.1", Istek.Tip.GET));
        yerel.uygula(new Istek("250.0.0.1", Istek.Tip.GET));



    }
}
