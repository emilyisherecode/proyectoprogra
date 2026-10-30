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
public class LibroInteractivo {
    private ArrayList<Leccion> listLeccion;

    // Arreglo unidimensional: títulos de los capítulos.
    private String[] capitulos = {
        "Hardware & Peripherals",
        "Software & Programming",
        "Multimedia & Digital Design"
    };

    // Arreglo bidimensional: columna 0 = inglés, columna 1 = español.
    // Filas 0-2: capítulo 1 | filas 3-5: capítulo 2 | filas 6-8: capítulo 3.
    private String[][] diccionario = {
        {"Keyboard", "Teclado"},
        {"Screen", "Pantalla"},
        {"Drawing tablet", "Tableta de dibujo"},
        {"Debugging", "Depuración"},
        {"Repository", "Repositorio"},
        {"Variable", "Variable"},
        {"Layers", "Capas"},
        {"Resolution", "Resolución"},
        {"Animation", "Animación"}
    };

    private int terminosPorCapitulo = 3;

    public LibroInteractivo() {
        this.listLeccion = new ArrayList<>();
        this.cargarLecciones();
    }

    public String addLeccion(Leccion leccion) {
        return this.listLeccion.add(leccion) ?
                ("Se agregó correctamente."):
                ("Error al agregar la lección.");
    }

    public Leccion getLeccion(int index) {
        return this.listLeccion.get(index);
    }

    public int totalLecciones() {
        return this.listLeccion.size();
    }

    public String getCapitulo(int index) {
        return this.capitulos[index];
    }

    public int totalCapitulos() {
        return this.capitulos.length;
    }

    /** Términos del capítulo, uno por línea, con el formato "Inglés = Español". */
    public String getTerminos(int capitulo) {
        String out = "";
        int inicio = capitulo * this.terminosPorCapitulo;
        for (int i = inicio; i < inicio + this.terminosPorCapitulo; i++) {
            if (i > inicio) {
                out += "\n";
            }
            out += this.diccionario[i][0] + " = " + this.diccionario[i][1];
        }
        return out;
    }

    private void cargarLecciones() {
        Leccion l1 = new LeccionVocabulario(this.capitulos[0],
                "Aprenda los nombres en inglés de los componentes del computador.",
                "Hardware");
        this.agregarPreguntasVocabulario(l1, 0);
        this.addLeccion(l1);

        Leccion l2 = new LeccionGramatica(this.capitulos[1],
                "Describa lo que hace el código con el presente simple.",
                "En tercera persona singular el verbo termina en -s (it stores, it repeats).");
        l2.addPregunta(new Pregunta("Complete: The loop ___ the code.", "repeats"));
        l2.addPregunta(new Pregunta("Complete: A variable ___ a value.", "stores"));
        l2.addPregunta(new Pregunta("Complete: The compiler ___ the program.", "translates"));
        this.addLeccion(l2);

        Leccion l3 = new LeccionVocabulario(this.capitulos[2],
                "Conozca los términos básicos del diseño digital y la multimedia.",
                "Multimedia");
        this.agregarPreguntasVocabulario(l3, 2);
        this.addLeccion(l3);
    }

    /** Crea una pregunta por cada término del capítulo; las opciones son los 3 significados. */
    private void agregarPreguntasVocabulario(Leccion leccion, int capitulo) {
        int inicio = capitulo * this.terminosPorCapitulo;
        for (int i = inicio; i < inicio + this.terminosPorCapitulo; i++) {
            Pregunta pregunta = new Pregunta(
                    "What does '" + this.diccionario[i][0].toLowerCase() + "' mean?",
                    this.diccionario[i][1]);
            for (int j = inicio; j < inicio + this.terminosPorCapitulo; j++) {
                pregunta.addOpcion(this.diccionario[j][1]);
            }
            leccion.addPregunta(pregunta);
        }
    }
}
