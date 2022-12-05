public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area del un circulo
        //pi * r2
        double areaCircle = circleArea(y);
        System.out.println("Area del circulo= " + areaCircle);

        //Area de una esfera
        //4*PI*r2
        double areaSphere = sphereArea(y);
        System.out.println("Area de la esfera= "+ areaSphere);

        //Volumen de una esfera
        //(4/3)*PI*r3
        double sphereVolume = sphereVolume(y);
        System.out.println("Volumen de la esfera = " + sphereVolume);
    }

    public static double circleArea(double r){
        return  Math.PI*Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,2);
    }

    public static double sphereVolume (double r){
        return (4/3)*Math.PI*Math.pow(r,3);
    }
}
