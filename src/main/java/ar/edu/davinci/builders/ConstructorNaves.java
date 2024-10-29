package ar.edu.davinci.builders;

public class ConstructorNaves {
    private static ConstructorNaves instancia;

    private ConstructorNaves() {}

    public static ConstructorNaves getInstancia() {
        if (instancia == null) {
            instancia = new ConstructorNaves();
        }
        return instancia;
    }

    public NaveBuilder crearNaveAtaque(int cantidadTripulantes, int cantidadMisiles, int danioOfensivo) {
        return new NaveAtaqueBuilder(cantidadTripulantes, cantidadMisiles, danioOfensivo);
    }

    public NaveBuilder crearNaveEmbajadora() {
        return new NaveEmbajadoraBuilder();
    }

    public NaveBuilder crearNaveMixta(int cantidadTripulantes, int cantidadConsules, int cantidadMisiles, int danioOfensivo) {
        return new NaveMixtaBuilder(cantidadTripulantes, cantidadConsules, cantidadMisiles, danioOfensivo);
    }
}
