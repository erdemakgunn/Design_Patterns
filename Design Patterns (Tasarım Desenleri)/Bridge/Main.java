package BridgeUzem;

public class Main {

    public static void main(String[] args) {

        IRenk r = new Koyu();
        UI wUI = new WinUI(r);
        wUI.uiOlustur();

        r = new Acik();
        UI lUI = new LinuxUI(r);
        lUI.uiOlustur();


        //sonradan eklenen class highContrast
        r = new HighContrast();
        wUI = new WinUI(r);
        wUI.uiOlustur();


    }
}
