package ar.edu.davinci.models;

import ar.edu.davinci.Modo;

public class NaveEmbajadora extends NaveBase {
    public NaveEmbajadora() {
        super(50);
    }

    @Override
    public int calcularDanio() {
        return getDanioOfensivo();
    }

    @Override
    public void atacar(Nave objetivo) {
        objetivo.recibirDanio(calcularDanio());
    }

    @Override
    public void agregarModo(Modo modo) {
        modo.activar();
    }
}