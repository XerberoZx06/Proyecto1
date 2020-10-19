
package principal;

import static principal.Principal.mostrarMenu;
import java.*;

public class Sensor{
       int sensores;
       private String estado;
       
       public Sensor(){
        
       }
       
       public Sensor(int s , String e ){
           this.sensores = s;
           this.estado = e;
       }
       
        public String getEstado(){
            return estado;
        }
        
        public void setEstado(String e){
            this.estado = e;
        }
        public int getSensores(){
            return sensores;
        }
        
        public void setSensores(int s){
            this.sensores = s;
        }
        
        public static void main(String[] args) {
            
            mostrarMenu();
        }
        
        public String toString(){
        
        return "("+ this.sensores + this.estado + "," + "0 libre";
        
    }
        
        
}
