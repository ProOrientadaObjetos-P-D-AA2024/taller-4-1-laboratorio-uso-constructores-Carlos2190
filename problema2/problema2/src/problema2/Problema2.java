package problema2;
public class Problema2 {
    public static void main(String[] args) {
        
        Provincia p = new Provincia ("Loja",10000);
        sueldo s = new sueldo(p,"Juan","Perez",1000,"1150708467");
        
        
        System.out.println("Resultados: ");
        System.out.println("Para el maestro "+s.getNombre()+" "+s.getApellido() +" con el numero de cedula de "+s.getCedula());
        System.out.println("De la provincia de "+s.getP().getNombreProvicia()+ " con un numero de habiatantes de "+s.getP().getNumeroHabitantes());
        System.out.println("Tiene un suledo basico de: "+s.getSueldo_B()+" con lo cual su sueldo total es de : "+s.calcularSueldoT());
        
        
        
        
    }
    
}
