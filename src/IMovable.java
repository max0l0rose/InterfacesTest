
public interface IMovable {

    final static int interfaceStatA = 1; // _final_ static !!

    IMovable INSTANCE = new IMovable() {
        //static int interfaceStatA = 2; // ERROR

        public int func() {
            return 1;
        }
    };

//    default IEngine.IAdditionalDevice defMethGas() {
//        System.out.println("IMovable::gas");
//        //a = 2; // error, final!
//        IEngine.IAdditionalDevice ad = null;
//        return ad;
//    }
//
//    static void interfaceStatMeth() {
//    }
}
