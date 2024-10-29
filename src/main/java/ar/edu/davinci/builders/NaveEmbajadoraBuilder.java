package ar.edu.davinci.builders;

import ar.edu.davinci.models.Nave;
import ar.edu.davinci.models.NaveEmbajadora;

public class NaveEmbajadoraBuilder implements NaveBuilder {
    @Override
    public Nave build() {
        return new NaveEmbajadora();
    }
}