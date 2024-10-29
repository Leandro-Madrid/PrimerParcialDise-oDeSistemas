package ar.edu.davinci.models;

import ar.edu.davinci.Mision;
import ar.edu.davinci.Modo;
import ar.edu.davinci.exceptions.CapacidadMaximaException;
import ar.edu.davinci.exceptions.CombustibleInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class NaveNodriza extends NaveBase {
    private int capacidadMaxima;
    private List<Nave> flota = new ArrayList<>();
    private List<Modo> modos = new ArrayList<>();
    private int contadorAtaques = 0;
    private int cantidadTripulantes;

    public NaveNodriza(int capacidadMaxima, int danioOfensivo, double combustibleInicial, int cantidadTripulantes) {
        super(danioOfensivo);
        this.capacidadMaxima = capacidadMaxima;
        this.nivelCombustible = combustibleInicial;
        this.cantidadTripulantes = cantidadTripulantes;
    }


    public int getCantidadTripulantes() {
        return cantidadTripulantes;
    }

    public void agregarNave(Nave nave) {
        try {
            if (flota.size() >= capacidadMaxima) {
                throw new CapacidadMaximaException("Capacidad máxima alcanzada. No se puede agregar la nave.");
            }
            flota.add(nave);
            System.out.println("Nave agregada exitosamente.");
        } catch (CapacidadMaximaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarNave(Nave nave) {
        if (flota.remove(nave)) {
            System.out.println("Nave eliminada exitosamente.");
        } else {
            System.out.println("La nave no se encuentra en la flota.");
        }
    }

    public int calcularDanioTotal() {
        return flota.stream().mapToInt(Nave::calcularDanio).sum() + getDanioOfensivo();
    }

    @Override
    public void atacar(Nave objetivo) {
        for (Nave nave : flota) {
            nave.atacar(objetivo);
        }
    }

    public void ejecutarMision(Mision mision) {
        for (Nave nave : flota) {
            mision.ejecutarMision(nave);
        }
    }

    @Override
    public void recibirDanio(int danio) {
        escudo -= Math.max(danio - getDanioDefensivo(), 0);
        if (escudo < 0) {
            escudo = 0;
            System.out.println("La nave ha recibido un daño crítico y no tiene escudo.");
        }
    }

    @Override
    public void viajar(double distancia) {
        try {
            super.viajar(distancia);
            System.out.println("Viaje realizado con éxito.");
        } catch (CombustibleInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void agregarModo(Modo modo) {
        modos.add(modo);
        System.out.println("Modo agregado: " + modo);
    }

    @Override
    public int calcularDanio() {
        return calcularDanioTotal();
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
}