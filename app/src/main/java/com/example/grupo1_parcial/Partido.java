package com.example.grupo1_parcial;

public class Partido {
    private String urlImagen;
    private String nombreEquipo;
    private String marcador;
    private String resultado;


    public Partido(){}

    public Partido(String urlImagen, String nombreEquipo, String marcador) {
        this.urlImagen = urlImagen;
        this.nombreEquipo = nombreEquipo;
        this.marcador = marcador;
    }
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }
}
