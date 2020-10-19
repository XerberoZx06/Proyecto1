
package principal;


import java.util.Scanner;
import Principal.Vehiculo;
import Principal.Sensor;

public class Principal {

    public static void main(String[] args) {
        mostrarMenu();
    }
    
        public static void mostrarMenu(){
            Scanner cor = new Scanner(System.in);
            
            boolean flag= true;
            
               while(flag){
                   System.out.println("0) salir del Programa. \n"+
                                      "1) Registrar Vehiculo. \n"+
                                      "2) Mostrar Historial.  \n"+
                                      "3) Mostrar Información de un Vehiculo. \n"+
                                      "4) Cambiar Estado de Vehiculo \n"+
                                      "5) Ingresar Capacidad del Parqueadero. \n");
          
        try{
            int prog = cor.nextInt();
            System.out.println();
        
        switch(prog){
            case 0: System.out.println("Bye.");
            break;
            
            case 1:
                try{
                System.out.println("ingrese los datos del vehiculo: \n");
                System.out.print("Marca:");
                String m = cor.next();
                System.out.println("Color:");
                String c = cor.next();
                System.out.println("placa:");
                String p = cor.next();
                System.out.println("Valor comercial:");
                int va = cor.nextInt();
                Vehiculo v = new Vehiculo(m,c,p,va);
                }
                catch(Exception l){
                    
                }
                break;
        
                
            case 2:
                System.out.println(Vehiculo.toStringVehiculos("all"));
                break;
            
            case 3:
                try{
                    System.out.println(InfoVehiculo().toString());
                }
                catch(IndexOutOfBoundsException l){
                    System.out.println("ERROR");
                }
                break;
                
            case 4:
                
                
            case 5:    
                }
        
               }
        
        }   
    
    }
        
        public static Vehiculo InfoVehiculo(){
        Scanner pol = new Scanner(System.in);
        System.out.print("Ingrese la placa del vehiculo: ");
        int p = pol.nextInt();
        return Vehiculo.vehiculos.get(p-1);
    }

}        

    
        
        



