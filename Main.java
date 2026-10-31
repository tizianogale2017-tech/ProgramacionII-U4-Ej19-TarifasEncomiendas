package Ejercicio19_TarifasEncomiendas;

public class Main {
    public static void main(String[] args) {
        SistemaTarifario sistema = new SistemaTarifario();
        MetodoEnvio[] metodos = {new EnvioTerrestre(), new EnvioAereo(), new EnvioEcologico()};

        System.out.println("Paquete de 3 kg a 10 km:");
        sistema.compararPresupuestos(metodos, 3, 10);
        System.out.println("Paquete de 25 kg a 800 km:");
        sistema.compararPresupuestos(metodos, 25, 800);
    }
}
