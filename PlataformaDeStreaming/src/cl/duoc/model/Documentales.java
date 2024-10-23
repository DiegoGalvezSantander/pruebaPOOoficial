/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */
public class Documentales extends Catalogo{
    private String EnfoqueEducativo;
    private int DuracionEnMinutos;

    public Documentales() {
    }

    public Documentales(String EnfoqueEducativo, int DuracionEnMinutos) {
        this.EnfoqueEducativo = EnfoqueEducativo;
        this.DuracionEnMinutos = DuracionEnMinutos;
    }

    public String getEnfoqueEducativo() {
        return EnfoqueEducativo;
    }

    public void setEnfoqueEducativo(String EnfoqueEducativo) {
        this.EnfoqueEducativo = EnfoqueEducativo;
    }

    public int getDuracionEnMinutos() {
        return DuracionEnMinutos;
    }

    public void setDuracionEnMinutos(int DuracionEnMinutos) {
        this.DuracionEnMinutos = DuracionEnMinutos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    @Override
    public String toString() {
        return "Documentales{" + "EnfoqueEducativo=" + EnfoqueEducativo + ", DuracionEnMinutos=" + DuracionEnMinutos + '}';
    }
    
    
}
