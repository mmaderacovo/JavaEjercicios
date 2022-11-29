public class LogicOperations {
    public static void main(String[] args) {
        int a = 8, b = 5;

        //Operadores de asignacion
        System.out.println("a es igual a b? -> "+ (a==b));
        System.out.println("a es diferente a b? -> "+ (a!=b));

        //Operadores relacionales
        System.out.println("a es menor que a b? -> "+ (a<b));
        System.out.println("a es mayor que a b? -> "+ (a>b));
        System.out.println("a es mayor o igual que a b? -> "+ (a>=b));
        System.out.println("a es menor o igual que a b? -> "+ (a<=b));

        //If Anidado
        if (a==b){
            System.out.println("a es igual a b");

        } else if ((a!=b)&& a<b) {
            System.out.println("a es diferente a b");

        } else if (a<b) {
            System.out.println("a es menor que a b");

        } else if (a>b) {
            System.out.println("a es mayor que a b");

        } else if (a>=b) {
            System.out.println("a es mayor o igual que a b");

        } else if (a<=b) {
            System.out.println("a es menor o igual que a b");

        }

    }
}
