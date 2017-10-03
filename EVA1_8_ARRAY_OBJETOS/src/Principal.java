/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno aaDatosAlumno[]; //aqui el arreglo es nulo
        Alumno aaDatosAlumno2[];
        aaDatosAlumno = new Alumno[10]; //creamos un arreglo qde 10 alumnos
        aaDatosAlumno2 = new Alumno[10];
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("Eduardo","16550558",0);
            aaDatosAlumno2[i] = new Alumno(aaDatosAlumno[i].getsNom(),aaDatosAlumno[i].getsMatricula(),aaDatosAlumno[i].getiCarrera());
        }
        for (Alumno aaDatosAlumno1 : aaDatosAlumno) {
            System.out.println("Nombre: " +  aaDatosAlumno1.getsNom());
            System.out.println("Matricula: " +  aaDatosAlumno1.getsMatricula());
            System.out.println("Carrera: " +  aaDatosAlumno1.getiCarrera());
        }
        for (Alumno aaDatosAlumno1 : aaDatosAlumno2) {
            System.out.println("Copia Nombre: " +  aaDatosAlumno1.getsNom());
            System.out.println("Copia Matricula: " +  aaDatosAlumno1.getsMatricula());
            System.out.println("Copia Carrera: " +  aaDatosAlumno1.getiCarrera());
        }
    }
    
}

class Alumno{
    private String sNom;
    private String sMatricula;
    private int iCarrera;

    public Alumno(String sNom, String sMatricula, int iCarrera) {
        this.sNom = sNom;
        this.sMatricula = sMatricula;
        this.iCarrera = iCarrera;
    }

    public String getsNom() {
        return sNom;
    }

    public String getsMatricula() {
        return sMatricula;
    }

    public int getiCarrera() {
        return iCarrera;
    }
    
    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }

    public void setiCarrera(int iCarrera) {
        this.iCarrera = iCarrera;
    }
}
