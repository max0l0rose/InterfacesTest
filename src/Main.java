public class Main {

    public static void main(String[] args) {
        IMovable iMovable = IMovable.INSTANCE;
        IMovable iMovable2 = IMovable.INSTANCE;
        assert(iMovable == iMovable2);
        //iMovable.func(); // ERROR
        int a = 1;
    }
}
