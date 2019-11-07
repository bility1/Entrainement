import org.apache.log4j.Logger;

public class Payement implements NaturePayment {
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroAutorisation() {
        return NumeroAutorisation;
    }

    public void setNumeroAutorisation(String numeroAutorisation) {
        NumeroAutorisation = numeroAutorisation;
    }

    private String email;
    private String NumeroAutorisation;
    private static Logger logger = Logger.getLogger(Panier.class);
    @Override
    public void pay(int amount) {
        logger.info("Paiement de " + amount + "€ par paypal" + email + NumeroAutorisation);
    }
}
