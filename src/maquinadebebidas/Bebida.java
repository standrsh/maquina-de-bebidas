// Herencia.

package maquinadebebidas;

public abstract class Bebida {
    
   private int leche;
   private int azucar;
   
   public int getAzucar(){
       return azucar;
   }
   
   public int getLeche() {
        return leche;
    }
    
    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }
    
    public void setLeche(int leche) {
        this.leche = leche;
     }
     
@Override
    public String toString() {
        return getClase() 
                +"; "+getDescripcion()+
                "; Azúcar "+getAzucar()+
                "; Leche "+getLeche();
    }
    
    public abstract String getDescripcion();
    
    public abstract double getPrecio();
    
    public abstract String getClase();
}
