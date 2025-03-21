// Study Point 2
// Daniel Hangaard

public class EBook extends NetBook {

    // Attributes
    private int characters;
    private boolean illustrated = false;

    // Constructor
    public EBook(String title, String literatureType,int availability, int reach, int use, int characters, boolean illustrated){
        super(title,literatureType,availability,reach,use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    // Methods
    private double calculatePages(){
        double pages = (this.characters / 1800.0) + 20;
        if (illustrated){
            pages *= 1.1; // If the eBook is illustrated + 10%
        }
        return pages;
    }

    @Override
    public double calculatePoints(){
        return this.calculatePages() * super.convertLiteratureType() * super.getPseudoCopies();
    }
}