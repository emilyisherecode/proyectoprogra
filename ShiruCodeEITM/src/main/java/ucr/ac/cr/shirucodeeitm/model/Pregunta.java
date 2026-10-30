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
public class Pregunta {
    private String enunciado, respuesta;
    private ArrayList<String> opciones;

    public Pregunta() {
        this.opciones = new ArrayList<>();
    }

    public Pregunta(String enunciado, String respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.opciones = new ArrayList<>();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public ArrayList<String> getOpciones() {
        return opciones;
    }

    public String addOpcion(String opcion) {
        return this.opciones.add(opcion) ?
                ("Se agregó correctamente."):
                ("Error al agregar la opción.");
    }

    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + ", respuesta=" + respuesta + '}';
    }
}
