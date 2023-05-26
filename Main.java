package Semana7_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CursoDocente cursodocente = new CursoDocente(3,3);
        int r = 0;
        //Cantidad de profesores para el curso
        System.out.println("Ingrese la cantidad de profesores");
        int a = sc.nextInt();
        cursodocente.setCant(a);
        cursodocente.agregarCurso(new Curso("CD1","Programacion Orientada a objetos","Fredy"));
        cursodocente.agregarCurso(new Curso("CD1","Programacion Orientada a objetos","Ethel"));
        r = r + cursodocente.getCant();

        System.out.println("Ingrese la cantidad de profesores");
        a = sc.nextInt();
        cursodocente.setCant(a+r);
        cursodocente.agregarCurso(new Curso("CD2","Estructura de Datos","Fredy"));
        r = r + cursodocente.getCant();

        System.out.println("Ingrese la cantidad de profesores");
        a = sc.nextInt();
        cursodocente.setCant(a+r);
        cursodocente.agregarCurso(new Curso("CD3","Base de Datos","Jose"));
        cursodocente.agregarCurso(new Curso("CD3","Base de Datos","Fredy"));





        int t = 0;
        //Cantidad de profesores para el curso
        System.out.println("Ingrese la cantidad de profesores");
        int b = sc.nextInt();
        cursodocente.setCant(b);
        cursodocente.agregarDocente(new Docente("Fredy",723940345,"Programacion orientada a objetos"));
        cursodocente.agregarDocente(new Docente("Fredy",723940345,"Programacion orientada a objetos"));
        cursodocente.agregarDocente(new Docente("Fredy",723940345,"Programacion orientada a objetos"));

        t = t + cursodocente.getCant();

        System.out.println("Ingrese la cantidad de profesores");
        b = sc.nextInt();
        cursodocente.setCant(b+t);
        cursodocente.agregarDocente(new Docente("Fredy",723940345,"Programacion orientada a objetos"));
        t = t + cursodocente.getCant();

        System.out.println("Ingrese la cantidad de profesores");
        b = sc.nextInt();
        cursodocente.setCant(b+t);
        cursodocente.agregarDocente(new Docente("Fredy",723940345,"Programacion orientada a objetos"));
        cursodocente.agregarDocente(new Docente("Fredy",723940345,"Programacion orientada a objetos"));






        cursodocente.mostrarCurso();
    }
}
