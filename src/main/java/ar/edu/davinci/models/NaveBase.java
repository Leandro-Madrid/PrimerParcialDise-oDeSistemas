package ar.edu.davinci.models;

import ar.edu.davinci.exceptions.CombustibleInsuficienteException;

public abstract class NaveBase implements Nave {
    protected double nivelCombustible;
    protected int escudo = 100;
    protected int energia = 100;
    protected int danioOfensivo;

    public NaveBase(int danioOfensivo) {
        this.danioOfensivo = danioOfensivo;
    }

    @Override
    public void viajar(double distancia) throws CombustibleInsuficienteException {
        double consumo = distancia * 1.1;
        if (!tieneCombustibleSuficiente(consumo)) {
            throw new CombustibleInsuficienteException("No hay combustible suficiente para el viaje.");
        }
        consumirCombustible(consumo);
    }

    @Override
    public boolean tieneCombustibleSuficiente(double cantidad) {
        return nivelCombustible >= cantidad;
    }

    @Override
    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public void consumirCombustible(double cantidad) {
        nivelCombustible -= cantidad;
    }

    @Override
    public int getEscudo() {
        return escudo;
    }

    @Override
    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getDanioDefensivo() {
        return escudo;
    }

    @Override
    public int getDanioOfensivo() {
        return danioOfensivo;
    }

    @Override
    public void setDanioOfensivo(int danio) {
        this.danioOfensivo = danio;
    }

    @Override
    public void recibirDanio(int danio) {
        escudo -= danio;
        if (escudo < 0) {
            escudo = 0;
        }
    }
}
