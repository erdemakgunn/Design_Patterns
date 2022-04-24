package ObserverUzem;

public class Kullanici extends Paylasimci implements Takipci {


    private String mail;

    public Kullanici(String isim, String mail) {
        super(isim);
        setMail(mail);
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {

        this.mail = mail;
    }


    @Override
    public void paylas(Post post) {
        System.out.println(getIsim() + " kullanıcısı " + post.getBaslik() + " paylaştı.");
        tumunuBilgilendir(post);
    }


    @Override
    public void bilgilendir(Post post) {
        System.out.println(getIsim() + " kullanıcısına " + post.getPaylasimci().getIsim()
                + " 'ın yaptığı paylaşım mesaj olarak gönderildi.");
    }
}
