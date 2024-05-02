package problema1;

public class Notas {
    
    private Universidad u;
    
     private String nombre_estudiante;
     private double calificacion1;
     private double calificacion2;
     private double calificacion3;

    public Notas(Universidad u, String nombre_estudiante, double calificacion1, double calificacion2, double calificacion3) {
        this.u = u;
        this.nombre_estudiante = nombre_estudiante;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public Universidad getU() {
        return u;
    }

    public void setU(Universidad u) {
        this.u = u;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public double getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public double getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public double getCalificacion3() {
        return calificacion3;
    }

    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }
    
    public double calcularpromedio() {
        
        return (calificacion1 + calificacion2 + calificacion3)/3;
        
    }
   
    
}
