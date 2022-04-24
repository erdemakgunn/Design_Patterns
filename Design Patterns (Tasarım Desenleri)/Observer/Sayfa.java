package ObserverUzem;

public class Sayfa extends Paylasimci {
    public Sayfa(String isim) {
        super(isim);
    }



    @Override
    public void paylas(Post post) {

        System.out.println(getIsim() + " sayfası " + post.getBaslik() + " paylaştı.");
        tumunuBilgilendir(post);
    }
}
