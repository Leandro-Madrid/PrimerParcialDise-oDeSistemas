package ar.edu.davinci;

import java.util.ArrayList;
import java.util.List;

public class NaveNodriza extends Nave {
    private int capacidadMaxima;
    private List<Nave> flota = new ArrayList<>();

    public NaveNodriza(int capacidadMaxima, int danioOfensivo) {
        if (danioOfensivo <= 0) throw new IllegalArgumentException("El daño ofensivo debe ser mayor a 0");
        this.capacidadMaxima = capacidadMaxima;
        this.danioOfensivo = danioOfensivo;
    }

    public void agregarNave(Nave nave) {
        if (flota.size() < capacidadMaxima) {
            flota.add(nave);
        } else {
            throw new IllegalStateException("Capacidad máxima alcanzada");
        }
    }

    public void eliminarNave(Nave nave) {
        flota.remove(nave);
    }

    public int calcularDanioTotal() {
        return flota.stream().mapToInt(Nave::calcularDanio).sum() + danioOfensivo;
    }

    @Override
    public void atacar(Nave objetivo) {
        objetivo.recibirDanio(calcularDanioTotal());
    }

    @Override
    public void recibirDanio(int danio) {
        escudo -= Math.max(danio - getDanioDefensivo(), 0);
    }

    @Override
    public void viajar(double distancia) {
        double consumo = distancia * 1.1;
        manejarViaje(consumo);
    }


    @Override
    public void agregarModo(Modo modo) {
        modo.activar(this);
    }

    @Override
    public int calcularDanio() {
        return danioOfensivo;
    }

    @Override
    public int getDanioDefensivo() {
        return escudo;
    }
}


