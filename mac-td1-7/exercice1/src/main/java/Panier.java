import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private static Logger logger = Logger.getLogger(Panier.class);
    List<Corrige> corriges;
    private NaturePayment naturePayement;

    public Panier(){
        this.corriges = new ArrayList<Corrige>();
    }
    public void addItem(Corrige corrige){
        this.corriges.add(corrige);
    }
    public void removeItem(Corrige corrige){
        this.corriges.remove(corrige);
    }
    public int calculerTotal(){
        int sum = 0;
        for(Corrige corrige : corriges){
            sum += corrige.getPrice();
        }
        return sum;
    }
    public void setNaturePayment(NaturePayment naturePayement){
        this.naturePayement=naturePayement;
    }
    public void pay(){

        int amount = calculerTotal();
        naturePayement.pay(amount);

    }
}
