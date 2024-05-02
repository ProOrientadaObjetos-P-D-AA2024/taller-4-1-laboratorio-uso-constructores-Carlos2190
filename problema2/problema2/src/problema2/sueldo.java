package problema2;

public class sueldo {
    
    
     private Provincia p;
     private String nombre;
     private String apellido;
     private double sueldo_B;
     private String cedula;

      public sueldo(Provincia p, String nombre, String apellido, double sueldo_B, String cedula) {
        this.p = p;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo_B = sueldo_B;
        this.cedula = cedula;
    }
      
    public Provincia getP() {
        return p;
    }

    public void setP(Provincia p) {
        this.p = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo_B() {
        return sueldo_B;
    }

    public void setSueldo_B(double sueldo_B) {
        this.sueldo_B = sueldo_B;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

     public double calcularSueldoT() {
        
        return (sueldo_B*0.20) + sueldo_B;
        
    }
   


     
    
}
