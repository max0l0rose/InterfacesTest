
public interface ICar {

    default void defMethod() {
    }

    private void defPrivMethod() {
    }

    static void statMethod() {
        statPrivMethod();
    }

    private static void statPrivMethod() {
    }
}
