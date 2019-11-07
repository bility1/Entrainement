package modele;

import org.apache.log4j.Logger;

public class Poire implements Fruit {
    private static Logger logger = Logger.getLogger(Poire.class);
    @Override
    public void getType() {
        logger.info("Poire");
    }
}
