/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.model;

/**
 *
 * @author LENOVO
 */
public class LeccionVocabulario extends Leccion {
    private String tema;

    public LeccionVocabulario() {
    }

    public LeccionVocabulario(String titulo, String descripcion, String tema) {
        super(titulo, descripcion);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String getIndicacion() {
        return "Elija en la lista el significado correcto.";
    }

    @Override
    public String getContenido() {
        return super.getContenido() + "\nTema de vocabulario: " + tema;
    }

    @Override
    public boolean evaluar(Pregunta pregunta, String respuesta) {
        return pregunta.getRespuesta().equals(respuesta);
    }
}

