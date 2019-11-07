package modele;

public class FabriqueChat implements FabriqueAnimal {
    private static final chat CHAT = new chat();
    public Animal creer() {
        chat nouveauChat = new  chat (CHAT.getCouleur());
        return nouveauChat;
    }
}
