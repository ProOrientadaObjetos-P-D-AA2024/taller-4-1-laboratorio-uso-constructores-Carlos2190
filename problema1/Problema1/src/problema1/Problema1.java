package problema1;

public class Problema1 {
    public static void main(String[] args) {
       
        Universidad u = new Universidad("UTPL","San Cayetano Alto, C. París ");
        
        Notas n = new Notas(u,"Carlos Espinoza",7.7,8.9,9.1);
        
        
        System.out.println("En la "+n.getU().getNombre_universidad()+" con direccion "+n.getU().getDireccion());
        System.out.println("Esta el estudiante "+n.getNombre_estudiante()+" con notas de : "+n.getCalificacion1()+" , "+n.getCalificacion2()+" , "+n.getCalificacion3()+" tiene un promedio de : "+n.calcularpromedio());
        
    }
    
}
