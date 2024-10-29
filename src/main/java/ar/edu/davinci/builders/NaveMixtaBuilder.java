package ar.edu.davinci.builders;

import ar.edu.davinci.models.Nave;
import ar.edu.davinci.models.NaveMixta;

public class NaveMixtaBuilder implements NaveBuilder {
    private int cantidadTripulantes;
    private int cantidadConsules;
    private int cantidadMisiles;
    private int danioOfensivo;

    public NaveMixtaBuilder(int cantidadTripulantes, int cantidadConsules, int cantidadMisiles, int danioOfensivo) {
        this.cantidadTripulantes = cantidadTripulantes;
        this.cantidadConsules = cantidadConsules;
        this.cantidadMisiles = cantidadMisiles;
        this.danioOfensivo = danioOfensivo;
    }

    @Override
    public Nave build() {
        return new NaveMixta(cantidadTripulantes, cantidadConsules, cantidadMisiles, danioOfensivo);
    }
}