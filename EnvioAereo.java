package Ejercicio19_TarifasEncomiendas;

public class EnvioAereo extends MetodoEnvio {
    private static final double FACTOR_PESO = 350;
    private static final double FACTOR_DISTANCIA = 5;

    public EnvioAereo() {
        super("Aéreo nacional", 3500);
    }

    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        validar(pesoKg, distanciaKm);
        return getTarifaBase() + pesoKg * FACTOR_PESO + distanciaKm * FACTOR_DISTANCIA;
    }
}
