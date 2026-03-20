package xavier.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;

    void load();
    default void checkPermission() {
        System.out.println("Checking permission...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Retrieving data size on interface...");
    }
}
