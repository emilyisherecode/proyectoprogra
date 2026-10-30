/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.model;

/**
 *
 * @author LENOVO
 */
public class Libro {
    private String titulo, descripcion;

    public Libro() {
    }

    public Libro(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContenido() {
        return titulo + "\n" + descripcion;
    }

    @Override
    public String toString() {
        return "ContenidoEducativo{" + "titulo=" + titulo + ", descripcion=" + descripcion + '}';
    }

}
