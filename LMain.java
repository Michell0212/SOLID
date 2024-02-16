// Clase main
public class LMain {
    public static void main(String[] args) {
        // array con instancias de Renault y Audi
        Lcoche[] arrayCoches = {
                new LRenault(),
                new LAudi()
        };
      
        imprimirNumAsientos(arrayCoches);
    }
    public static void imprimirNumAsientos(Lcoche[] arrayCoches){
        for (Lcoche coche : arrayCoches) {
            // Imprime el número de asientos
            System.out.println(coche.numAsientos());
        }
    }
}