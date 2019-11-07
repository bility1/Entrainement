import org.apache.log4j.Logger;


public class PayementCB implements NaturePayment  {
    private static Logger logger = Logger.getLogger(PayementCB.class);

    public String getNom() {
        return nom;
    }

    public String getNoCarte() {
        return noCarte;
    }

    public String getCrypto() {
        return crypto;
    }

    public String getExpire() {
        return expire;
    }

    private String nom;
    private String noCarte;
    private String crypto;
    private String expire;
    public PayementCB(String nom, String noCarte, String crypto, String expire) {
    this.nom=nom;
    this.crypto=crypto;
    this.expire=expire;
    this.noCarte=noCarte;
    }



    @Override
    public void pay(int amount) {
        logger.info("Paiement de " + amount + "€ par " + nom + "CB " + noCarte + "/" + crypto + " expire:" + expire);
    }
}
