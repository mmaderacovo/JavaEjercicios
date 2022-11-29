public class IfStatement {
    public static void main(String[] args) {
        boolean isBluethoothEnable = false;
        int fileSended = 0;

        if (isBluethoothEnable){
            fileSended++;
            System.out.println("Archivos enviados = " + fileSended);
        } else {
            System.out.println("Revisa que tu bluetooth este encendido");
        }
    }
}
