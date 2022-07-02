public class Exercise {

    public static void main(String[] args) {

        suma(2, 8, -3);

        Coche miCoche = new Coche();
        
        miCoche.agregarPuerta();
        
        System.out.println(miCoche.num_puertas);

    }

            
    /*Primera parte:
    Crear una función con tres parámetros que sean números que se suman entre sí.
    Llamar a la función en el main y darle valores. */

    public static void suma (int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
    /*Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto. */

class Coche {

    public int num_puertas = 4;

    public void agregarPuerta() {
        this.num_puertas++;
    }
}





