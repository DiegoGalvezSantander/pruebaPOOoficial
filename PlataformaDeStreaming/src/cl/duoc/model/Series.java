/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.model;

/**
 *
 * @author Cetecom
 */
public class Series extends Catalogo {
    private int NumeroDeTemporadas;
    private String Finalizada;

    public Series(String you) {
    }

    public Series(int NumeroDeTemporadas, String Finalizada) {
        this.NumeroDeTemporadas = NumeroDeTemporadas;
        this.Finalizada = Finalizada;
    }

    public int getNumeroDeTemporadas() {
        return NumeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int NumeroDeTemporadas) {
        this.NumeroDeTemporadas = NumeroDeTemporadas;
    }

    public String getFinalizada() {
        return Finalizada;
    }

    public void setFinalizada(String Finalizada) {
        this.Finalizada = Finalizada;
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
        return "Series{" + "NumeroDeTemporadas=" + NumeroDeTemporadas + ", Finalizada=" + Finalizada + '}';
    }
    
    
}
