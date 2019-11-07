package modele;

import org.apache.log4j.Logger;

public class Hobbit {
    private String prenom;
    private static Logger logger = Logger.getLogger(Hobbit.class);

    Hobbit(String prenom){
        this.prenom = prenom;
    }
   void mange(String prenom){
        logger.info(prenom);
    }
}
