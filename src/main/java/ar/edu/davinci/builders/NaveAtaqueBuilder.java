package ar.edu.davinci.builders;

import ar.edu.davinci.models.Nave;
import ar.edu.davinci.models.NaveAtaque;

public class NaveAtaqueBuilder implements NaveBuilder {
    private int cantidadTripulantes;
    private int cantidadMisiles;
    private int danioOfensivo;

    public NaveAtaqueBuilder(int cantidadTripulantes, int cantidadMisiles, int danioOfensivo) {
        this.cantidadTripulantes = cantidadTripulantes;
        this.cantidadMisiles = cantidadMisiles;
        this.danioOfensivo = danioOfensivo;
    }

    @Override
    public Nave build() {
        return new NaveAtaque(cantidadTripulantes, cantidadMisiles, danioOfensivo);
    }
}