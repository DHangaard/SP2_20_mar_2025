// Study Point 2
// Daniel Hangaard

public class EAudioBook extends NetBook implements IAudioBook {

    // Attributes
    private int durationInMinutes;

    // Constructor
    public EAudioBook(String title, String literatureType,int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    // Methods
    @Override
    public double calculatePoints(){
        return (this.durationInMinutes * 0.5) * super.convertLiteratureType() * super.getPseudoCopies();
    }
}