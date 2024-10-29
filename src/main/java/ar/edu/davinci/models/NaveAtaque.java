package ar.edu.davinci.models;

import ar.edu.davinci.Modo;

import java.util.ArrayList;
import java.util.List;

public class NaveAtaque extends NaveBase {
    private int cantidadTripulantes;
    private int cantidadMisiles;
    private List<Modo> modos = new ArrayList<>();

    public NaveAtaque(int cantidadTripulantes, int cantidadMisiles, int danioOfensivo) {
        super(danioOfensivo);
        this.cantidadTripulantes = cantidadTripulantes;
        this.cantidadMisiles = cantidadMisiles;
    }

    @Override
    public int calcularDanio() {
        int bonificacion = modos.stream().mapToInt(Modo::getBonificacionDanio).sum();
        return (getDanioOfensivo() + bonificacion) * cantidadMisiles;
    }

    @Override
    public void atacar(Nave objetivo) {
        objetivo.recibirDanio(calcularDanio());
    }

    @Override
    public void agregarModo(Modo modo) {
        modos.add(modo);
    }
}