public class Vehiculo{
    
    
    public static Vehiculo[] vehiculos;
    public static int cantidad = 0;
    private String marca;
    private String color;
    private String placa;
    private int valorComercial;

    
   
    public Vehiculo(String p, String c, String m){
        
        this(p,c,m,30000000);
       
    }
    
    public Vehiculo(String p, String c, String m,int va){
        this.placa = p;
        this.color = c;
        this.marca = m;
        this.valorComercial = va;
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
                                "Valor Comercial: \n" + this.valorComercial);
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
