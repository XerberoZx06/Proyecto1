import java.time.LocalDateTime;


public class Vehiculo{
    
    
    public static Vehiculo[] vehiculos;
    public static int cantidad = 0;
    private String marca;
    private String color;
    private String placa;
    private int valorComercial;
    private String tipo;
    private LocalDateTime fechaHoraIngreso;
    

    
   
    public Vehiculo(String m, String c, String p, LocalDateTime fh){
        
        this(p,c,m,30000000,fh);
       
    }
    
    public Vehiculo(String m, String c, String p,int va, LocalDateTime fh){
        this.marca = m;
        this.color = c;
        this.placa = p;
        this.valorComercial = va;
        this.fechaHoraIngreso = fh;
        cantidad++;
        
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
   
    public String toString(){
        String mensaje;
        
        mensaje = String.format("informacion del vehiculo \n"+
                                "Marca:"+ this.marca + "\n" +
                                "Color:"+ this.color + "\n" + 
                                "Placa:"+ this.placa + "\n"+
                                "Valor Comercial: \n" + this.valorComercial+ "\n"+
                                "Fecha y Hora:"+ this.fechaHoraIngreso);
        return mensaje;
    }

    public static String toStringVehiculos(){
        
        String answer = "";
        for (int i = 0; i<vehiculos.length; i++)
            {
              if(vehiculos[i] != null)
              {
                  answer += vehiculos[i].toString()+"\n";
              }
            }
        return answer;
   
    }  
       
        public static int cantidadVehiculos(){
            return cantidad;
        }
     
}
