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
public class Leccion extends Libro{
    private ArrayList<Pregunta> listPregunta;
    private String objetivo, explicacion;
    public Leccion() {
        this.listPregunta = new ArrayList<>();
    }

    public Leccion(String titulo, String descripcion, String objetivo, String explicacion) {
        super(titulo, descripcion);
        this.listPregunta = new ArrayList<>();
        this.objetivo = objetivo;
        this.explicacion = explicacion;
    }

    // Cada lección hija sobrescribe este método con su propia indicación.
    public String getIndicacion() {
        return "";
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    // Cada lección hija sobrescribe este método con su propia forma de evaluar.
    public boolean evaluar(Pregunta pregunta, String respuesta) {
        return false;
    }

    public void addPregunta(Pregunta pregunta) {
        this.listPregunta.add(pregunta);
    }
    
    public ArrayList<Pregunta> getPreguntas() {
        return listPregunta;
    }

    public Pregunta getPregunta(int indice) {
        return listPregunta.get(indice);
    }
    
}
