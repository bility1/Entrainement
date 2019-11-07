package modele;

public class TheMain {
    public static void main(String[] args) {
        ArbreFruitier pommier = new Pommier();
        ArbreFruitier poirier = new Poirier("poirier");
        Hobbit maraudeur = new Hobbit("Merry");
        maraudeur.mange(pommier.creer());
        maraudeur.mange(poirier.creer());
    }
}
