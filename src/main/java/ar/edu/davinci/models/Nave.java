package ar.edu.davinci.models;

import ar.edu.davinci.Modo;
import ar.edu.davinci.exceptions.CombustibleInsuficienteException;

public interface Nave {
    void viajar(double distancia) throws CombustibleInsuficienteException;
    void agregarModo(Modo modo);
    int calcularDanio();
    void atacar(Nave objetivo);
    void recibirDanio(int danio);
    double getNivelCombustible();
    void consumirCombustible(double cantidad);
    boolean tieneCombustibleSuficiente(double cantidad);
    int getEscudo();
    void setEscudo(int escudo);
    int getDanioOfensivo();
    void setDanioOfensivo(int danio);
}