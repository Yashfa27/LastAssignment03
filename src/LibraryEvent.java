public class LibraryEvent {
    // Type of the event (e.g., "MEDIA_ADDED", "PRICE_UPDATED")
    private String eventType;
    private Media media;
    private double newPrice;

    // Constructor for add new media
    public LibraryEvent(String eventType, Media media) {
        this.eventType = eventType;
        this.media = media;
        this.newPrice=0;
    }

    // Constructor for price update event
    public LibraryEvent(String eventType, Media media, double newPrice) {
        this.eventType = eventType;
        this.media = media;
        this.newPrice = newPrice;
    }

    // Getters
    public String getEventType() {
        return eventType;
    }

    public Media getMedia() {
        return media;
    }

    public double getNewPrice() {
        return newPrice;
    }
}
