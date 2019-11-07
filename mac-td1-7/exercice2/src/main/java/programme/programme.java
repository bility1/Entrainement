package programme;


import modele.Animal;
import modele.FabriqueAnimal;
import modele.FabriqueChat;
import org.apache.log4j.Logger;

public class programme {
    private static Logger logger= Logger.getLogger(programme.class);
    public static void main(String[] args) {
        FabriqueAnimal fabriqueChat = new FabriqueChat();
        Animal chat = fabriqueChat.creer();
        Animal copichat = fabriqueChat.creer();
        logger.info(chat+":"+chat.getCouleur());
        logger.info(copichat+":"+copichat.getCouleur());
    }
}

