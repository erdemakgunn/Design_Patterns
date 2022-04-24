package ObserverUzem;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Kullanici kullanici1 = new Kullanici("Sefa Aras", "sefa@ktu.edu");
        Kullanici kullanici2 = new Kullanici("Hakan Bozkurt", "hakan@ktu.edu");
        Kullanici kullanici3 = new Kullanici("Tolga Kahraman", "tolga@ktu.edu");

        Grup grup = new Grup("Yazılım");
        Sayfa sayfa = new Sayfa("Teknoloji");

        kullanici1.takipciEkle(kullanici2);
        kullanici1.takipciEkle(kullanici3);
        kullanici1.takipciEkle(grup);
        sayfa.takipciEkle(kullanici1);
        sayfa.takipciEkle(kullanici2);
        sayfa.takipciEkle(kullanici3);
        sayfa.takipciCikar(kullanici2);
        sayfa.takipciEkle(grup);


        kullanici1.paylas(new Post("Resim", getImage(), kullanici1));

        sayfa.paylas(new Post("Başlık", "İçerik", sayfa));


    }


    public static BufferedImage getImage() {
        String imagePath = "Test Image";
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            return null;
        }
    }

}
