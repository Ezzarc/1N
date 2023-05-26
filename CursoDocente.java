package Semana7_2;

public class CursoDocente {
    private int id;
    private Curso curso[];
    private Docente docente[];
    private int indiceCurso;
    private int cant;
    private int indiceDocente;
    public void setCant(int cant){
        this.cant = cant;
    }
    public int getCant(){
        return cant;
    }
    public CursoDocente(){
    }
    public CursoDocente(int sizeCurso,int sizeDocente){
        this.curso = new Curso[sizeCurso];
        this.docente = new Docente[sizeDocente];
        this.id = id;
        this.indiceDocente = 0;
        this.indiceCurso = 0;
    }
    public int getId(){
        return id;
    }
    public void agregarCurso(Curso curso){
        this.curso[this.indiceCurso] = curso;
        this.indiceCurso++;
    }
    public void agregarDocente(Docente docente){
        this.docente[this.indiceDocente] = docente;
        this.indiceDocente++;
    }
    public void mostrarCurso(){
        int a;
        a = this.curso.length+this.cant-1;
        for(int i=0;i<a;i++){
            System.out.println(this.curso[i].getId()+" "+
            this.curso[i].getNombre()+" "+
            this.curso[i].getDocente());
        }
    }
    public void mostrarDocente(){
        int b;
        b = this.docente.length+this.cant-1;
        for(int i=0;i<b;i++){
            System.out.println(this.docente[i].getDni()+" "+
                    this.docente[i].getNombres()+" "+
                    this.docente[i].getCurso());
        }
    }
}
