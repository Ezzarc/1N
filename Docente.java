package Semana7_2;

public class Docente {
    private int Dni;
    private String nombres;
    private String apellidos;
    private String curso;

    public Docente() {

    }

    public Docente(String nombres,  int dni,String curso){
        this.Dni = dni;
        this.nombres = nombres;
        this.curso = curso;
    }

    public int getDni() {
        return Dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCurso() {
        return curso;
    }
}