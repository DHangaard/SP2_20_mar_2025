import java.util.ArrayList;

public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        // Create instances of Author
        Author a0 = new Author("Olga Ravn"); // Use author as test - royalties = 4213,64 kr
        Author a1 = new Author("Jens Hansen");
        Author a2 = new Author("Marianne Ærv");
        Author a3 = new Author("Charles Dickens");


        // Create ArrayList of Author and insert Author instances
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(a0);
        authors.add(a1);
        authors.add(a2);
        authors.add(a3);


        // Add books to authors
        // Author 0
        a0.addTitle(new PrintedBook("Celestine", "skøn", 140, 166)); // Works with lowercase in literatureType
        a0.addTitle(new AudioBook("Celestine", "SKØN", 140, 192));

        // Author 1
        a1.addTitle(new PrintedBook("Bog2","FAG",100, 400));
        a1.addTitle(new AudioBook("Bog1","TE",100,300));
        a1.addTitle(new EBook("Bog3", "LYRIK", 20, 60, 50, 100000, true));
        a1.addTitle(new EAudioBook("Bog4","SKØN",20,60,50,480));

        // Author 2
        a2.addTitle(new PrintedBook("Bog1","LYRIK",100, 300));
        a2.addTitle(new AudioBook("Bogen om bøger","LYRIK",300,280));
        a2.addTitle(new EBook("Bog af Tine","BI",40,50,60,130000,false));
        a2.addTitle(new EAudioBook("Bog4","LYRIK",20,60,50,480));

        // Author 3
        a3.addTitle(new PrintedBook("A Tale of Two Cities", "SKØN", 2000, 544));


        // Print toString, displaying authors royalties
        for (Author a : authors){
            System.out.println(a);
        }
    }
}