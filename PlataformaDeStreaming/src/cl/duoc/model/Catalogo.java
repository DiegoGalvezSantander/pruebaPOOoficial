/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */
public abstract class Catalogo {
    public String codigo;
    public String recomendacion;

    public Catalogo() {
    }

    public Catalogo(String codigo, String recomendacion) {
        this.codigo = codigo;
        this.recomendacion = recomendacion;
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
        return "Catalogo{" + "codigo=" + codigo + ", recomendacion=" + recomendacion + '}';
    }
    
    
}
