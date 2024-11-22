// Media interface for defining common media behaviors
interface Media {
    double updatePrice(double newPrice);
    double currentPrice();
    String toString();
}

// Book class implementing Media interface
class Book implements Media {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Get the current price
    @Override
    public double currentPrice() {
        return price;
    }

    // Update price
    @Override
    public double updatePrice(double newPrice) {
        this.price = newPrice;
        return price;
    }

    @Override
    public String toString() {
        return "Book[Title: " + title + ", Author: " + author + ", Price: " + price + "]";
    }
}

// Movie class implementing Media interface
class Movie implements Media {
    String name;
    String writer;
    double price;

    // Constructor
    Movie(String name, String writer, double price) {
        this.name = name;
        this.writer = writer;
        this.price = price;
    }

    // Get the current price
    @Override
    public double currentPrice() {
        return price;
    }

    // Update price
    @Override
    public double updatePrice(double newPrice) {
        this.price = newPrice;
        return price;
    }

    @Override
    public String toString() {
        return "Movie[Name: " + name + ", Writer: " + writer + ", Price: " + price + "]";
    }
}


// Magazine class implementing Media interface
class Magazine implements Media {
    String title;
    String publisher;
    double price;

    // Constructor
    Magazine(String title, String publisher, double price) {
        this.title = title;
        this.publisher = publisher;
        this.price = price;
    }

    // Get the current price
    @Override
    public double currentPrice() {
        return price;
    }

    // Update price
    @Override
    public double updatePrice(double newPrice) {
        this.price = newPrice;
        return price;
    }

    @Override
    public String toString() {
        return "Magazine[Title: " + title + ", Publisher: " + publisher + ", Price: " + price + "]";
    }
}
public class MediaTest {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "Linda", 100.0);
        System.out.println("Current book price: " + book.currentPrice());
        book.updatePrice(120.0);
        System.out.println("Updated book price: " + book.updatePrice(book.price));

        Movie movie = new Movie("Interstellar", "Christopher Nolan", 150.0);
        System.out.println("Current movie price: " + movie.currentPrice());
        movie.updatePrice(180.0);
        System.out.println("Updated movie price: " + movie.updatePrice(movie.price));

        Magazine magazine = new Magazine("The New York Times Magazine", "A.G. Sulzberger", 990.0);
        System.out.println("Current magazine price: " + magazine.currentPrice());
        movie.updatePrice(180.0);
        System.out.println("Updated magazine price: " + magazine.updatePrice(magazine.price));


    }
}
