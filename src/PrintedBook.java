// Study Point 2
// Daniel Hangaard

public class PrintedBook extends PhysicalBook {

    // Attributes
    private int pages;

    // Constructor
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    // Methods
    @Override
    protected double calculatePoints() {
        return pages * super.convertLiteratureType() * copies;
    }
}