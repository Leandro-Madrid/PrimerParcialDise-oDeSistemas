package ar.edu.davinci;

import ar.edu.davinci.models.Nave;

public class MisionDiplomatica implements Mision {
    private String planetaDestino;

    public MisionDiplomatica(String planetaDestino) {
        this.planetaDestino = planetaDestino;
    }

    @Override
    public void ejecutarMision(Nave nave) {
        System.out.println(nave.getClass().getSimpleName() + " está yendo a " + planetaDestino + " para una misión diplomática.");
    }

    public String getPlanetaDestino() {
        return planetaDestino;
    }
}