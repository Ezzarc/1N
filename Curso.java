package Semana7_2;

public class Curso {
    private String id;
    private String nombre;
    private String docente;

    public Curso(){

    }

    public Curso(String id, String nombre, String docente) {
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocente() {
        return docente;
    }
}
