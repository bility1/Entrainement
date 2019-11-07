import java.util.ArrayList;
import java.util.Collection;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String email;
    private String numeroTelephone;
    private Collection<Contact> contacts;
    public Personne(PersonneBuilder builder){
        this.nom=builder.getNom();
        this.prenom=builder.getPrenom();
        this.adresse=builder.getAdresse();
        this.ville=builder.getVille();
        this.email=builder.getEmail();
        this.numeroTelephone=builder.getNumeroTelephone();
        this.contacts=builder.getContacts();
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", email='" + email + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                ", contacts=" + contacts +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public Collection<Contact> getContacts() {
        return contacts;
    }

    public Boolean ajout(Contact c){
        return this.contacts.add(c);

    }


    // On crée une classe Builder
    public static class PersonneBuilder {
        private String nom;
        private String prenom;
        private String adresse;
        private String ville;
        private String email;
        private String numeroTelephone;
        private Collection<Contact> contacts = new ArrayList();

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public PersonneBuilder(String nom, String prenom) { //On retourne un builder pour pouvoir faire des appels en cascade
            this.nom = nom;
            this.prenom = prenom;
        }

        public PersonneBuilder adresse(String adresse) {
            this.adresse = adresse;
            return this;
        }

        public PersonneBuilder ville(String ville) {
            this.ville = ville;
            return this;
        }

        public PersonneBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonneBuilder numeroTel(String numeroTelephone) {
            this.numeroTelephone = numeroTelephone;
            return this;
        }

        public PersonneBuilder BuildContact(Contact.SocialNetwork reseau, String idContactReseau) {
            Contact c = new Contact(reseau, idContactReseau);
            System.out.println(c);
            this.contacts.add(c);
            return this;
        }

        public Collection<Contact> getContacts() {
            return contacts;
        }


        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public String getAdresse() {
            return adresse;
        }

        public String getVille() {
            return ville;
        }

        public String getEmail() {
            return email;
        }

        public String getNumeroTelephone() {
            return numeroTelephone;
        }

        public Personne buildPersonne() {
            return new Personne(this);
        }
    }
}






