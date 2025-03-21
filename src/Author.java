// Study Point 2
// Daniel Hangaard

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Author {

    // Attributes
    private String name;
    private ArrayList<Title> titles;

    // Constructor
    public Author (String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    // Methods
    public void addTitle(Title title){
        this.titles.add(title);
    }

    public float calculateTotalPay(){
        float totalPay = 0;
        for (Title t : titles){
            totalPay += t.calculateRoyalty();
        }
        return totalPay;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##"); // Returns calculateTotalPay with two decimals
        return this.name + ": " + df.format(calculateTotalPay()) + " kr";
    }

    // Accessors
    public String getName() {
        return this.name;
    }
}