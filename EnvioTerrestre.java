package Ejercicio19_TarifasEncomiendas;

public class EnvioTerrestre extends MetodoEnvio {
    private static final double FACTOR_PESO = 80;
    private static final double FACTOR_DISTANCIA = 1.5;

    public EnvioTerrestre() {
        super("Terrestre urbano", 1000);
    }

    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        validar(pesoKg, distanciaKm);
        return getTarifaBase() + pesoKg * FACTOR_PESO + distanciaKm * FACTOR_DISTANCIA;
    }
}
