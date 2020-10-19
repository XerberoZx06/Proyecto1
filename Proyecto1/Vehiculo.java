package Principal;

import static principal.Principal.mostrarMenu;
import java.util.ArrayList;

public class Vehiculo{
    
    private static ArrayList<Vehiculo>vehiculos= new ArrayList<>();
    private ArrayList<Sensor> sensores = new ArrayList<>();
    public static Object Vehiculo;
    public int cantidad = 0;
    private String marca;
    private String color;
    private String placa;
    private int valorComercial;
    public int cantidadVehiculos;
    
    public static void main(String[] args) {
        int[] Vehiculos = new int[8];
                    
        int pos=-1;
        int buscar=1;
        
        for(int i = 0; i < Vehiculos.length; i++){
            if(buscar == Vehiculos[i]){
                pos =i;
                break;
            }
        }
   
        mostrarMenu();
    } 
  
    public Vehiculo(){
        this.cantidad = cantidadVehiculos;
        vehiculos.add(this);
        cantidadVehiculos++;
    }
    
    public Vehiculo(String p, String c, String m){
        this.placa = p;
        this.color = c;
        this.marca = m;
    }
    
    public Vehiculo(String p, String c, String m,int va){
        this.placa = p;
        this.color = c;
        this.marca = m;
        this.valorComercial = va;
        
        valorComercial++;
        
    }
        public void setMarca(String m){
            this.marca = m;
        }
        
        public String getMarca(){
            return marca;
        }   
        
        public void setColor(String c){
            this.color = c;
        }
        
        public String getColor(){
            return color;
        }
        
        public void setPlaca(String p){
            this.placa = p;
        }
        
        public String getPlaca(){
            return placa;
        }
         
        public void setValorComercial(int va){
            this.valorComercial = va;
        }
        
        public int getValorComercial(){
            return valorComercial;
        }
        
        public ArrayList<Sensor> getSensores(){
            return this.sensores;
        }
        public void setSensores(ArrayList s){
            this.sensores = s;
        }
         

    public String toString(){
        String mensaje;
        
        mensaje = String.format("informacion del vehiculo \n"+
                                "Marca: \n"+
                                "Color: \n"+
                                "Placa: \n"+
                                "Valor Comercial: \n" + this.marca+ "," + this.color + "," + this.placa + "," + this.vehiculos);
        
        for(Sensor sensor: this.sensores){
            mensaje += sensor.toString()+"\n";
        }
  
        return mensaje;
    }
    
    
    
    public static String toStringVehiculos(String c){
        String text = "";
        
        if(Vehiculo.vehiculos.size()== 0 ){
            text = "n| No hay vehiculos. |n";
        }else if (c.equalsIgnoreCase("all")){
            for(Vehiculo vehiculo : Vehiculo.vehiculos){
                text += vehiculo.toString()+"\n";
            }
        }else{
            for(Vehiculo vehiculo: Vehiculo.vehiculos){
                if(vehiculo.getColor().equalsIgnoreCase(c)){
                    text += vehiculo.toString()+"\n";
                }
            }
        }
        
        if(text.equalsIgnoreCase("")){
            return "\n no hay vehiculo. \n";
        }else{
            return text;
        }
        
        
        
    }  
       
        public static int cantidadVehiculos(){
            return Vehiculo.vehiculos.size();
        }
        
        public int cantidadSensores(){
            return this.sensores.size();
        }
        
        public void anadirSensor(Sensor sensor){
            this.sensores.add(sensor);
        }
    
        
        
}