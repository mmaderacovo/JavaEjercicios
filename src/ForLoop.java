public class ForLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOfflight();
        for (int i = 1; i <=10 ; i++) {
            printSOS();

        }
    }
    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOfflight() {
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
