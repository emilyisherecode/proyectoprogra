# proyectoprogra
Shiru Code: English, IT & Multimedia 🧊📚

Repositorio oficial del proyecto programado de la Etapa 1 para el curso Fundamentos de Programación (TM-2100) de la Universidad de Costa Rica (UCR), Sede del Pacífico.

🧭 Descripción del Proyecto

Shiru Code: English, IT & Multimedia es una aplicación interactiva de escritorio que está desarrollada en Java. Su objetivo principal es facilitar el aprendizaje y la comprensión del inglés técnico especializado en informática y tecnología multimedia por medio de una experiencia lúdica, estructurada y visualmente atractiva, o sea, que sea divertida de usar y no se sienta como estudiar de forma tradicional.

La aplicación está ambientada en una temática inspirada en el Ártico, guiada por la mascota oficial Shiru (una foca ártica) y organizada en tres módulos fundamentales:

Hardware & Peripherals: Componentes físicos y dispositivos.
Software & Programming: Lógica, código y herramientas de desarrollo.
Multimedia & Digital Design: Conceptos gráficos, vectores y producción multimedia.
🛠️ Arquitectura y Aspectos Técnicos
Lenguaje: Java
Gestor de dependencias: Apache Maven
Patrón de diseño: Modelo-Vista-Controlador (MVC), que asegura la separación limpia entre la lógica, los datos y las interfaces gráficas.
Interfaz Gráfica (GUI): Java Swing (con el diseño de los formularios hecho en NetBeans y AbsoluteLayout).
Estructuras de Datos:
Arreglos unidimensionales para los capítulos.
Arreglos bidimensionales (matrices) para el glosario bilingüe técnico.
ArrayList dinámicos para la gestión de las lecciones y de las preguntas interactivas.
📂 Estructura del Repositorio

El código fuente se organiza bajo el siguiente empaquetado, siguiendo el patrón MVC:

ucr.ac.cr.modelo: Contiene las entidades, las clases abstractas (Leccion), las clases hijas (LeccionVocabulario, LeccionGramatica), la clase contenedora principal (LibroInteractivo) y las preguntas.
ucr.ac.cr.vista: Agrupa las interfaces gráficas de usuario hechas en Java Swing (FrmMenuPrincipal, los capítulos y el glosario).
ucr.ac.cr.controlador: Gestiona los eventos y la comunicación entre la vista y el modelo, es decir, es lo que conecta lo que se ve con lo que se procesa.
ucr.ac.cr.main: Contiene la clase de arranque (ShiruCodeEITM) para inicializar la aplicación.
🚀 Instrucciones de Ejecución Local
Asegúrate de tener instalado Java JDK (compatible con Java 26 / versiones recientes) y también Apache Maven.
Clona este repositorio o descarga el código fuente en tu equipo:

Bash

git clone https://github.com/tu-usuario/ShiruCodeEITM.git
Abre el proyecto con tu entorno de desarrollo favorito que sea compatible con Maven (como Apache NetBeans).
Ejecuta la clase principal que está ubicada en ucr.ac.cr.shirucodeeitm.ShiruCodeEITM para iniciar la aplicación de escritorio.
👥 Equipo de Trabajo
Emily Rocio Suarez Quiros (Propuesta educativa, alcance y objetivos)
Dylan (Requerimientos, mapa de navegación y bocetos)
Warner (Diseño técnico UML, POO, polimorfismo, estructuras de datos y MVC)

Universidad de Costa Rica — Sede del Pacífico | 2026

El errorcito mínimo esta vez fue “tambien” sin tilde. Dejé tal cual los comandos, los nombres de paquetes y clases, los nombres del equipo y los emojis, porque en un README eso no se debe tocar.

Un par de cosas por si querés revisarlas antes de entregar:

La ruta de la clase principal no coincide. En “Estructura del Repositorio” decís que la clase ShiruCodeEITM está en ucr.ac.cr.main, pero en las instrucciones de ejecución aparece como ucr.ac.cr.shirucodeeitm.ShiruCodeEITM. Una de las dos debería corregirse.
La URL del git clone sigue siendo de ejemplo (tu-usuario), y además es distinta a la del apartado 8 (shiru-code-itm contra ShiruCodeEITM). Conviene poner la dirección real y que sea la misma en ambos lados.
