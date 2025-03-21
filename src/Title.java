// Study Point 2
// Daniel Hangaard

public abstract class Title {

    // Attributes
    private String title;
    protected String literatureType;
    private static final double rate = 0.067574; // Rate as of 2025 - changed to private instead of protected

    // Constructor
    public Title(String title, String literatureType){
        this.title = title;
        this.literatureType = literatureType.toUpperCase();
    }

    // Abstract methods
    protected abstract double calculatePoints();

    // Concrete methods
    public double calculateRoyalty(){
        return calculatePoints() * rate;
    }

    protected double convertLiteratureType(){
        switch (this.literatureType) {
            case "BI":
            case "TE":
                return 3.0;

            case "LYRIK":
                return 6.0;

            case "SKØN":
                return 1.7;

            case "FAG":
                return 1.0;

            default:
                System.out.println("Fejl! Ukendt litteraturtype: " + literatureType);
                return 0.0;
        }
    }
}