package modele;

public class chat implements Animal {
    private static String NOIR="noir";


    private String couleur ;

    chat(){
        this.couleur=NOIR;
    }

    public chat(String couleur) {
        this.couleur=couleur;
    }

    public String getCouleur() {
        return couleur;
    }


}
