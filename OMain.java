// Clase principal con el método main
public class OMain {
    public static void main(String[] args) {
        // Crea un array de coches con instancias de los 3 coches
        Ocoche[] arrayCoches = {
                new ORenault(),
                new OAudi(),
                new OMercedes()
        };
        // imprimirPrecioMedioCoche con el array de coches
        imprimirPrecioMedioCoche(arrayCoches);
    }

    // imprime el precio medio de cada coche en el array
    public static void imprimirPrecioMedioCoche(Ocoche[] arrayCoches){
        for (Ocoche coche : arrayCoches) {
            // Imprime precio
            System.out.println(coche.precioMedioCoche());
        }
    }
}