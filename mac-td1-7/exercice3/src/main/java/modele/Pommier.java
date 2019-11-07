package modele;

public class Pommier extends AbsArbreFruitier {
    private static final String fabriquePomme = "POMME";

    public Pommier() {
        super(fabriquePomme);
    }

    @Override
    public String creer() {
        return null;
    }
}
