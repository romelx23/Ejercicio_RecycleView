package com.example.damsemana_recycleview;

public class Restaurante {
    private String nombre;
    private String urlphoto;
    private float valoraciones;
    private String direccion;

    public Restaurante(String nombre, String urlphoto, float valoraciones, String direccion) {
        this.nombre = nombre;
        this.urlphoto = urlphoto;
        this.valoraciones = valoraciones;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrlphoto() {
        return urlphoto;
    }

    public float getValoraciones() {
        return valoraciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUrlphoto(String urlphoto) {
        this.urlphoto = urlphoto;
    }

    public void setValoraciones(float valoraciones) {
        this.valoraciones = valoraciones;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
