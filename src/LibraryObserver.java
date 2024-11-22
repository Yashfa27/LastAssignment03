public interface LibraryObserver {
    //Notify media add or update
    void onMediaAdded(Media media);
    void onPriceUpdated(Media media);
}
