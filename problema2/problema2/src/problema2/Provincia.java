package problema2;

public class Provincia {
    
    
    private String nombreProvicia;
    private int numeroHabitantes;

    public Provincia(String nombreProvicia, int numeroHabitantes) {
        this.nombreProvicia = nombreProvicia;
        this.numeroHabitantes = numeroHabitantes;
    }
    

    public String getNombreProvicia() {
        return nombreProvicia;
    }

    public void setNombreProvicia(String nombreProvicia) {
        this.nombreProvicia = nombreProvicia;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
    
    
    
}
