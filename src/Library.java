import java.util.ArrayList;
import java.util.List;

// Library class to manage media
public class Library<M extends Media> {

    List<M> mediaItems = new ArrayList<>();
    List<LibraryObserver> observers = new ArrayList<>();

    // Add media to library and notify observers
    public void usersAddMedia(M media) {
        mediaItems.add(media);
        notifyObservers(new LibraryEvent("MEDIA_ADDED", media, 0));
    }

    // Update price of media and notify observers
    public void updateMediaPrice(M media, double newPrice) {
        if (media != null) {
            media.updatePrice(newPrice);
            notifyObservers(new LibraryEvent("PRICE_UPDATED", media, newPrice));
        }
    }

    // Add an observer
    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    // Remove an observer
    public void removeObserver(LibraryObserver observer) {
        observers.remove(observer);
    }

    // Notify all observers with a new event
    private void notifyObservers(LibraryEvent event) {
        for (LibraryObserver observer : observers) {
            if ("MEDIA_ADDED".equals(event.getEventType())) {
                observer.onMediaAdded(event.getMedia());
            } else if ("PRICE_UPDATED".equals(event.getEventType())) {
                observer.onPriceUpdated(event.getMedia());
            }
        }
    }

    //t
    public static void main(String[] args) {
        Library<Media> library = new Library<>();
        library.addObserver(new LibraryObserver() {
            @Override
            public void onMediaAdded(Media media) {
                System.out.println("New media added: " + media);
            }

            @Override
            public void onPriceUpdated(Media media) {
                System.out.println("Price updated for media: " + media);
            }
        });

        // Create a sample media (Book)
        Media book = new Book("Java Programming", "Author X", 2919.3);
        // Add book to library
        library.usersAddMedia(book);
        // Update book price
        library.updateMediaPrice(book, 344.9);

        System.out.println("--------------------------");
        // Create a sample movie (Movie)
        Media movie = new Movie("Inception", "Christopher Nolan", 679.2);
        // Add movie to library
        library.usersAddMedia(movie);

        // Update movie price
        library.updateMediaPrice(movie, 200.0);
        System.out.println("--------------------------");

        // Create a sample magazine
        Media magazine = new Magazine("The New York Times Magazine", "A.G. Sulzberger", 149.0);
        // Add movie to library
        library.usersAddMedia(magazine);

        // Update movie price
        library.updateMediaPrice(magazine, 173.0);
        System.out.println("--------------------------");
    }

}
