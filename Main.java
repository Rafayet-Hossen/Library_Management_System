import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Library> libraries = new ArrayList<>();
        libraries.add(new Library("Oppekha", "Humayon Ahmed", "Drama"));
        libraries.add(new Library("Moyurakkhi", "Humayon Ahmed", "Romantic"));
        libraries.add(new Library("Himu", "Humayon Ahmed", "Drama"));
        libraries.add(new Library("Ognibina", "Kazi Nazrul Islam", "War,Drama"));
        libraries.add(new Library("Bisher Bashi", "Kazi Nazrul Islam", "Drama"));

        for (Library library : libraries) {
            if(library.getAuthor() == "Kazi Nazrul Islam")
            {
                System.out.println("Name: "+library.getBookTitle()+" Book Catagory: "+library.getCategory());
            }
        }
    }
}