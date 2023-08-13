
package Modelo;


public class MdlConversor {
    
    public double aDolares(double pesos){
        Double Dolares = pesos*0.00031;
        return Dolares;
    }
    
        public double aPesos(double dolares){
        Double Pesos = dolares*3734;
        return Pesos;
    }
}
