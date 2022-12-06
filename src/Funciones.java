public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //Area del un circulo
        //pi * r2
        double areaCircle = circleArea(y);
        System.out.println("Area del circulo= " + areaCircle);

        //Uso de la funcion
        System.out.println("Dollar= "+ convertToDollar(20,"COP"));

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

    public static double convertToDollar (double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.051;
                break;
            case "COP":
                quantity = quantity * 0.00021;
                break;
        }
        return quantity;
    }
}
