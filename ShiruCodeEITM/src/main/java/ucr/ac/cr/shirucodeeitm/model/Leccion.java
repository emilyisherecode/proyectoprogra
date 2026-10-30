/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.model;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public abstract class Leccion extends Libro{
    private ArrayList<Pregunta> listPregunta;

    public Leccion() {
        this.listPregunta = new ArrayList<>();
    }

    public Leccion(String titulo, String descripcion) {
        super(titulo, descripcion);
        this.listPregunta = new ArrayList<>();
    }

    // Cada lección hija sobrescribe este método con su propia indicación.
    public String getIndicacion() {
        return "";
    }

    // Cada lección hija sobrescribe este método con su propia forma de evaluar.
    public boolean evaluar(Pregunta pregunta, String respuesta) {
        return false;
    }

    public String addPregunta(Pregunta pregunta) {
        return this.listPregunta.add(pregunta) ?
                ("Se agregó correctamente."):
                ("Error al agregar la pregunta.");
    }

    public Pregunta getPregunta(int index) {
        return this.listPregunta.get(index);
    }

    public int totalPreguntas() {
        return this.listPregunta.size();
    }
}
