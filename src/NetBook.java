// Study Point 2
// Daniel Hangaard

public abstract class NetBook extends Title{

    // Attributes
    private int availability;
    private int reach;
    private int use;

    // Constructor
    public NetBook (String title, String literatureType, int availability, int reach, int use){
        super(title, literatureType);
        this.use = use;
        this.availability = availability;
        this.reach = reach;
    }

    // Methods
    protected double getPseudoCopies(){
        return (this.availability*0.5) + getUseFactor();
    }

    private int getUseFactor(){
        return (this.reach*5) + this.use;
    }
}