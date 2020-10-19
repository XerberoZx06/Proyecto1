
public class Sensor{
       public static Sensor[] sensores;
       private int estado;
       
       public Sensor(){
        
       }
       
       public Sensor(int e ){
          
           this.estado = e;
       }
       
        public int getEstado(){
            return estado;
        }
        
        public void setEstado(int e){
            this.estado = e;
        }
       
        
        public String toString(){
        
        return "("+ this.estado + "," + "0 libre";
        
    }
    
    public static String sensorLibre(){
        String answer = "";
        for (int i = 0; i<sensores.length; i++)
            {
              if(sensores[i] == null)
              {
                  answer += "espacio libre:"+ i +"\n";
              }
            }
        return answer;
       }
        
        
}
