package ObserverUzem;

public class Grup implements Takipci {
    private String isim;

    public Grup(String isim) {
        setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    @Override
    public void bilgilendir(Post post) {
        System.out.println(getIsim() + " grup üyelerin " + post.getPaylasimci().getIsim()
                + "'ın yaptığı paylaşım mail olarak gönderildi.");
    }
}
