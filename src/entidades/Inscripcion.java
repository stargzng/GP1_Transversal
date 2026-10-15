package entidades;

public class Inscripcion {

    private int idCursada;
    private double nota;
    private double asistencia;
    private int año;
    
    private Alumno alumno;
    private Materia materia;

    
    public Inscripcion(double nota, double asistencia, int año, Alumno alumno, Materia materia) {
        this.nota = nota;
        this.asistencia = asistencia;
        this.año = año;
        this.alumno = alumno;
        this.materia = materia;
    }
    
    public Inscripcion(int idCursada, double nota, double asistencia, int año, Alumno alumno, Materia materia) {
        this.idCursada = idCursada;
        this.nota = nota;
        this.asistencia = asistencia;
        this.año = año;
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getIdCursada() {
        return idCursada;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(double asistencia) {
        this.asistencia = asistencia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    
    

    
}
