import java.awt.*;


public class CargoShip extends Ship {
    //Specific attributes

    private int maximumLoadWeight;
   private int compartments;

    //Constructor
     CargoShip(Color color, String owner, String country, int capacity) {
        super(color, owner, country, capacity);
    }

    public void setmaximumLoadWeight(int weight){
        this.maximumLoadWeight=weight;

    }

    public int setmaximumLoadWeight(){
        return this.maximumLoadWeight;

    }
    public void setCompartments(int comps){
        this.compartments=comps;

    }

    public int getCompartments(){
        return this.compartments;

    }

}
