package vistas;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import persistencia.AlumnoData;
import persistencia.miConexion;
import java.time.LocalDate;
import java.time.Month;
import persistencia.InscripcionData;
import persistencia.MateriaData;


public class Prueba {
    
    private miConexion conexion = new miConexion("jdbc:mysql://localhost:3306/universidad", "root", "");
    private AlumnoData alumnoData = new AlumnoData(conexion);
    private InscripcionData inscripcionData = new InscripcionData(conexion);
    private MateriaData materiaData = new MateriaData(conexion);
    
    public static void main(String[] args) {

        Alumno al1 = new Alumno(24, 4345434, "Ramiro", LocalDate.of(2007, Month.JUNE, 8), true); // entidad-registro
        Alumno al2 = new Alumno(44752666, "Lando Norris", LocalDate.now(), false);
        Materia mat1 = new Materia(1, "Matematica 1", false);
        Inscripcion i1 = new Inscripcion(7.5, 85.0, 2026, al1, mat1);
        new Prueba().conectar(al1, mat1, i1);
        
        
    }

    void conectar(Alumno alumno, Materia materia, Inscripcion inscripcion) {
        
        //se guarda el alumno (INSERT)
        alumnoData.guardarAlumno(alumno);
      
        //se busca un alumno por ID (SELECT)
        Alumno aux = alumnoData.buscarAlumno(alumno.getId()); 
        System.out.println(aux.toString()); //se imprimen los datos del alumno consultado.
      
        //Alta de alumno
        alumnoData.altaAlumno(alumno.getId());

        //Baja de alumno
        alumnoData.bajaAlumno(alumno.getId());
      
        //actualizar alumno
        alumnoData.actualizarDatos(25, 44722665, "Lando Norris", LocalDate.now(), true);
       
        //eliminar un alumno
        alumnoData.eliminarAlumno(23);
        alumnoData.eliminarAlumno(24);
        alumnoData.eliminarAlumno(26);

          

        inscripcionData.inscribirAlumno(inscripcion);
        inscripcionData.editarCursada(0, 0, 0, 0, alumno, materia);       
        inscripcionData.EstaInscripto(alumno, materia);
        inscripcionData.eliminarCursada(2);  

    }
    
}









