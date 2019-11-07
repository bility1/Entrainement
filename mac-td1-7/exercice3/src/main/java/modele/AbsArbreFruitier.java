package modele;

public abstract class AbsArbreFruitier implements ArbreFruitier {
    public String fabriqueFruit;
    Fruit Cueille() {
        return null;
    }
    public AbsArbreFruitier(String fabriqueFruit)
    {
        this.fabriqueFruit=fabriqueFruit;
    }
}
