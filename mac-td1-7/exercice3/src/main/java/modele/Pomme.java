package modele;

import org.apache.log4j.Logger;

public class Pomme implements Fruit {
private static Logger logger = Logger.getLogger(Pomme.class);

    @Override
    public void getType() {

        logger.info("Pomme");
    }
}
