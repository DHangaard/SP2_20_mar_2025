public abstract class PhysicalBook extends Title {

    // Attributes
    protected int copies;

    // Constructor
    public PhysicalBook (String title, String literatureType, int copies){
        super(title, literatureType);
        this.copies = copies;
    }
}