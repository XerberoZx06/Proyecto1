
import java.util.Scanner;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {
        mostrarMenu();
    }
    
    public static void mostrarMenu(){
        Scanner cor = new Scanner(System.in);
        System.out.print("ingrese la cantidad de espacios del parqueadero:");
        int leng = cor.nextInt();
        Vehiculo.vehiculos = new Vehiculo[leng];
        Sensor.sensores = new Sensor[leng];
        Motos.motos = new Motos[leng];
        Carros.carros = new Carros[leng];
        
        
        
        
        boolean flag= true;
            
        while(flag){
                   System.out.println("0) salir del Programa. \n"+
                                      "1) Espacios Libres: \n"+
                                      "2) Registro de Vehiculos:  \n"+
                                      "3) Registro de Vehiculos con valor comercial:. \n"+
                                      "4) Imprimir Informacion de vehiculos: \n"+
                                      "5) Cantidad de Vehiculos parqueados: \n"+
                                      "6) Consultar Información de un vehiculo: \n"+
                                      "7) Cambiar estado manual de un sensor: \n"+
                                      "8) Consulta con el color: \n");
          
        //try{
            int prog = cor.nextInt();
            System.out.println();
        
        switch(prog){
            case 0: 
                break;
            
            case 1:
                System.out.println(Sensor.sensorLibre());
                break;
            
            case 2:
               
                System.out.println("ingrese espacio: \n");    
                int espacio = cor.nextInt();
                if(Vehiculo.vehiculos[espacio]== null){
                    System.out.println("ingrese los datos del vehiculo: \n");
                    System.out.print("Marca:");
                    String m = cor.next();
                    System.out.println("Color:");
                    String c = cor.next();
                    System.out.println("placa:");
                    String p = cor.next();
                    LocalDateTime fh = LocalDateTime.now();
                    Vehiculo.vehiculos[espacio] = new Vehiculo(m,c,p,fh);
                    Sensor.sensores[espacio] = new Sensor();
                    }else{
                        System.out.print("El espacio esta ocupado.");
                        }
                break;
        
          
            case 3:     
               System.out.println("ingrese espacio: \n");    
                espacio = cor.nextInt();
                if(Vehiculo.vehiculos[espacio]== null){ 
                System.out.println("ingrese los datos del vehiculo: \n");
                System.out.print("Marca:");
                String m = cor.next();
                System.out.println("Color:");
                String c = cor.next();
                System.out.println("placa:");
                String p = cor.next();
                System.out.println("Valor comercial:");
                int va = cor.nextInt();
                LocalDateTime fh = LocalDateTime.now();
                Vehiculo.vehiculos[espacio] = new Vehiculo(m,c,p,va,fh);
                Sensor.sensores[espacio] = new Sensor(0);
                }else{
                    System.out.println("El espacio esta ocupado.");
                        }
                
                break;
                
                
            case 4:
                System.out.println(Vehiculo.toStringVehiculos());
            break;
            
            case 5:
                System.out.println(Vehiculo.cantidad);
            break;    
                
            case 6:
                System.out.println("ingresa el numero:");
                
                System.out.println(Sensor.sensorLibre());
                System.out.println(Vehiculo.toStringVehiculos());
            break;
            
            case 7:
                System.out.println("ingresa el numero del sensor a cambiar estado:");
            int cambiaEstado = cor.nextInt();    
            if(Vehiculo.vehiculos[cambiaEstado]==null){
                System.out.println("este espacio se ha desabilitado.");
                Sensor.sensores[cambiaEstado] = new Sensor();
            }else{
                System.out.println("el espacio se ha habilitado.");
            }  
                System.out.println(Sensor.sensorLibre());
             break;
             
             case 8:
                System.out.println("ingrese el color que desea buscar:");
                    
            }
         
        }
        
    }
}

    
        
        



