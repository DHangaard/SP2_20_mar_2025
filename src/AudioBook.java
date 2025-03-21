// Study Point 2
// Daniel Hangaard


public class AudioBook extends PhysicalBook implements IAudioBook{

    // Attributes
    private int durationInMinutes;

    // Constructor
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    // Methods
    @Override
    protected double calculatePoints(){
        return (this.durationInMinutes*0.5) * super.convertLiteratureType() * copies;
    }
}