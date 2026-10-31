package Ejercicio19_TarifasEncomiendas;

public class SistemaTarifario {
    public double presupuestar(MetodoEnvio metodo, double pesoKg, double distanciaKm) {
        return metodo.calcularTarifa(pesoKg, distanciaKm);
    }

    public void compararPresupuestos(MetodoEnvio[] metodos, double pesoKg, double distanciaKm) {
        for (MetodoEnvio m : metodos) {
            try {
                System.out.printf("%-20s -> $ %,9.2f%n", m.getNombre(), presupuestar(m, pesoKg, distanciaKm));
            } catch (IllegalArgumentException e) {
                System.out.printf("%-20s -> no disponible: %s%n", m.getNombre(), e.getMessage());
            }
        }
    }
}
