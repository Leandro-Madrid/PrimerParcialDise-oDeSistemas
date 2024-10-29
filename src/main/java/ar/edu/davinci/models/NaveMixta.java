package ar.edu.davinci.models;

import ar.edu.davinci.Modo;

import java.util.ArrayList;
import java.util.List;

public class NaveMixta extends NaveBase {
    private int cantidadConsules;
    private List<Modo> modos = new ArrayList<>();

    public NaveMixta(int cantidadTripulantes, int cantidadConsules, int cantidadMisiles, int danioOfensivo) {
        super(danioOfensivo);
        this.cantidadConsules = cantidadConsules;
    }

    @Override
    public int calcularDanio() {
        int danioTotal = getDanioOfensivo() * cantidadConsules;
        for (Modo modo : modos) {
            danioTotal += modo.getBonificacionDanio();
        }
        return danioTotal;
    }

    @Override
    public void atacar(Nave objetivo) {
        objetivo.recibirDanio(calcularDanio());
    }

    @Override
    public void agregarModo(Modo modo) {
        modos.add(modo);
        System.out.println("Modo agregado: " + modo);
    }
}