public class BuclesPractica {
    public static void main(String[] args) {

        int numeroIf = -3;

        if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
        System.out.println("**********************************************************");
        int numeroWhile = 0;

        while (numeroWhile<3) {
            numeroWhile++;
            System.out.println("El número tiene el valor: " + numeroWhile);
        }
        System.out.println("**********************************************************");
        do {
            numeroWhile++;
            System.out.println("El número tiene el valor: " + numeroWhile);
        }
        while (numeroWhile==0);
        System.out.println("**********************************************************");
        int numeroFor = 0;
        for (int i = 0; i<=3; i++) {
            numeroFor++;
            System.out.println("El número tiene el valor: " + numeroFor);
        }
        System.out.println("**********************************************************");
        String estacion = "primavera";
        switch (estacion) {
            case "verano":
                System.out.println("Usted está en verano, disfrute del calor y la playa");
                break;
            case "otoño":
                System.out.println("Usted está en otoño, verá muchas hojas caer de los árboles");
                break;
            case "invierno":
                System.out.println("Usted está en invierno, use abrigo y tome sopa caliente");
                break;
            case "primavera":
                System.out.println("Usted está en primavera, la mejor estación del año");
                break;
            default:
                System.out.println("El valor no corresponde a una estación climática del año");
        }
    }
}