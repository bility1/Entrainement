public class main {
    public static void main(String[] args) {
        Panier panier =  new Panier();
        Corrige corrige1 = new Corrige(12);
        Corrige corrige2 = new Corrige(52);

        panier.addItem(corrige1);
        panier.addItem(corrige2);
        NaturePayment np= new PayementCB("berete","12233","1054","01/20");
        panier.pay();
    }
}

