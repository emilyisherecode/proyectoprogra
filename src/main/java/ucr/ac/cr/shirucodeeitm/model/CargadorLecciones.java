/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class CargadorLecciones {
    private FileReader CapituloLectura;
    private Pregunta pregunta;
    public CargadorLecciones() {
    }
    
    
    
    private BufferedReader abrirArchivo(Integer cap) throws IOException{
        CapituloLectura = new FileReader("contenido/capitulo"+cap+".txt");
        return new BufferedReader(CapituloLectura);
    }
    
    public Leccion cargarCapitulo(int cap) {
        Leccion leccion = null;
        String linea;
        try {
            BufferedReader buffer = abrirArchivo(cap);
            while ((linea = buffer.readLine()) != null) {
                leccion = validarLeccion(buffer, linea);
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("ERROR" + e);
        }
        return leccion;
    }
    
    private Leccion validarLeccion(BufferedReader buffer, String linea) throws IOException{
        if(linea.equalsIgnoreCase("TIPO=VOCABULARIO")){
            return crearVocabulario(buffer);
        }else if(linea.equalsIgnoreCase("TIPO=GRAMATICA")){
            return crearGramatica(buffer);
        }
        return null;
    }

    private LeccionVocabulario crearVocabulario(BufferedReader buffer) throws IOException {
        LeccionVocabulario leccion = new LeccionVocabulario();
        String linea = "";
        String valid = "";
        String contenido = "";
        while((linea = buffer.readLine()) != null){
            if(linea.indexOf("=") != -1){
                valid = linea.substring(0, linea.indexOf("="));
                contenido = linea.substring(linea.indexOf("=") +1);
                switch(valid){
                    case "TITULO":
                        leccion.setTitulo(contenido);
                        break;
                    case "DESCRIPCION":
                        leccion.setDescripcion(contenido);
                        break;
                    case "OBJETIVO":
                        leccion.setObjetivo(contenido);
                        break;
                    case "EXPLICACION":
                        leccion.setExplicacion(contenido);
                        break;
                    case "TEMA":
                        leccion.setTema(contenido);
                        break;
                }
            }else if(linea.indexOf("|") != -1 && linea.substring(0, linea.indexOf("|")).equalsIgnoreCase("P")){
                pregunta = new Pregunta();
                String resto = linea.substring(linea.indexOf("|") + 1); 
                
                pregunta.setEnunciado(resto.substring(0, resto.indexOf("|")));
                resto = resto.substring(resto.indexOf("|") + 1);
                
                pregunta.setRespuesta(resto.substring(0, resto.indexOf("|")));
                resto = resto.substring(resto.indexOf("|") + 1);
                
                String opciones = resto.substring(0, resto.indexOf("|"));
                pregunta.setExplicacion(resto.substring(resto.indexOf("|") + 1));
                
                while(opciones.indexOf(";") != -1){
                String opcion = opciones.substring(0, opciones.indexOf(";"));
                opciones = opciones.substring(opciones.indexOf(";") + 1);
                pregunta.addOpcion(opcion);
                }
                leccion.addPregunta(pregunta);
            }
        }
        return leccion;
    }

    private LeccionGramatica crearGramatica(BufferedReader buffer) throws IOException {
        LeccionGramatica leccion = new LeccionGramatica();
        String linea = "";
        String valid = "";
        String contenido = "";
        while((linea = buffer.readLine()) != null){
            if(linea.indexOf("=") != -1){
                valid = linea.substring(0, linea.indexOf("="));
                contenido = linea.substring(linea.indexOf("=") +1);
                switch(valid){
                    case "TITULO":
                        leccion.setTitulo(contenido);
                        break;
                    case "DESCRIPCION":
                        leccion.setDescripcion(contenido);
                        break;
                    case "OBJETIVO":
                        leccion.setObjetivo(contenido);
                        break;
                    case "EXPLICACION":
                        leccion.setExplicacion(contenido);
                        break;
                    case "REGLA":
                        leccion.setRegla(contenido);
                        break;
                }
            }else if(linea.indexOf("|") != -1 && linea.substring(0, linea.indexOf("|")).equalsIgnoreCase("P")){
                pregunta = new Pregunta();
                String resto = linea.substring(linea.indexOf("|") + 1); 
                
                pregunta.setEnunciado(resto.substring(0, resto.indexOf("|")));
                resto = resto.substring(resto.indexOf("|") + 1);
                
                pregunta.setRespuesta(resto.substring(0, resto.indexOf("|")));
                resto = resto.substring(resto.indexOf("|") + 1);
                
                pregunta.setExplicacion(resto.substring(resto.indexOf("|") + 1));
                leccion.addPregunta(pregunta);
            }
        }
        return leccion;
    }
}
