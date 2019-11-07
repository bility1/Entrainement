public class Contact {
    public enum SocialNetwork {FACEBOOK, LINKEDIN, TWITTER, INSTAGRAM}

    ;
    SocialNetwork reseau;
    String idContactReseau;

    public Contact(SocialNetwork sn, String id) {
        this.reseau = sn;
        this.idContactReseau = id;
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return "Contact{" +
                "reseau=" + reseau +
                ", idContactReseau='" + idContactReseau + '\'' +
                '}';
    }
}