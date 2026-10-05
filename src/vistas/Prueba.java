package vistas;

import entidades.Alumno;
import persistencia.AlumnoData;
import persistencia.miConexion;
import java.time.LocalDate;


public class Prueba {
    
    private miConexion conexion = new miConexion("jdbc:mysql://localhost:3306/universidad", "root", "");
    private AlumnoData alumnoData = new AlumnoData(conexion);
    
    public static void main(String[] args) {

        Alumno estudioso = new Alumno(28180533, "El ko Ala", LocalDate.now(), false); // entidad-registro
        Alumno al1 = new Alumno(44752666, "Lando Norris", LocalDate.now(), false);
        new Prueba().conectar(al1);
        
        
    }

    void conectar(Alumno alumno) {
        
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
        
        
        
        
    }
    
}









