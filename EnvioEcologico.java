package Ejercicio19_TarifasEncomiendas;

public class EnvioEcologico extends MetodoEnvio {
    private static final double PESO_MAXIMO_KG = 10;
    private static final double DISTANCIA_MAXIMA_KM = 15;
    private static final double FACTOR_PESO = 40;
    private static final double FACTOR_DISTANCIA = 4;

    public EnvioEcologico() {
        super("Bicicleta ecológica", 500);
    }

    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        validar(pesoKg, distanciaKm);
        // Una bicicleta no puede llevar mucho peso ni ir muy lejos.
        if (pesoKg > PESO_MAXIMO_KG || distanciaKm > DISTANCIA_MAXIMA_KM) {
            throw new IllegalArgumentException("Fuera del alcance de la bicicleta (máx. 10 kg y 15 km)");
        }
        return getTarifaBase() + pesoKg * FACTOR_PESO + distanciaKm * FACTOR_DISTANCIA;
    }
}
