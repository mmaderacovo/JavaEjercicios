public class Casting {
    public static void main(String[] args) {
        double monthlyDogs= 30.0/12.0;
        System.out.println(monthlyDogs);

        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);

        char x = 'z';
        int xI= x;
        System.out.println(xI);

        int i = 250;
        long iL= i;
        System.out.println(iL);

        short iS = (short) iL;
        System.out.println(iS);

        double d = 301.067;
        long dL = (long) d;
        System.out.println("dL = " + dL);

        int f = 100;
        System.out.println((float) f+5000.66);

        int g = 737;
        System.out.println((byte)g*100);

        double h = 298.638;
        System.out.println((long)h/25);
    }
}
