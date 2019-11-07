public class Main {
    public static void main(String[] args) {
        Personne homme = new Personne.PersonneBuilder("Smith", "Will").adresse("Rue").email("@").numeroTel("0234365421").ville("Paris").BuildContact(Contact.SocialNetwork.FACEBOOK, "id_01").buildPersonne();
        Personne femme = new Personne.PersonneBuilder("Nana", "Nana").adresse("Place").email("@").numeroTel("0234365568").ville("Bordeaux").buildPersonne();
        System.out.println(homme);
        System.out.println(femme);

    }
}